package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.BookBean;
import model.bean.CartBean;
import model.bean.Orders;
import model.bean.OrderBean;
import model.bean.OrderDetailBean;
import model.bean.CustomerBean;
import model.bean.UserBean;
import model.bo.BookBo;
import model.bo.CartBo;
import model.bo.CategoryBo;
import model.bo.CustomerBo;
import model.bo.UserBo;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CategoryBo categoryBo = new CategoryBo();
	private CartBo cartBo = new CartBo();
	
	private BookBo bookBo = new BookBo();
	private UserBo userBo = new UserBo();
	private CustomerBo customerBo = new CustomerBo();
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Lấy dữ liệu từ client utf-8
		request.setCharacterEncoding("utf-8");
		// Gửi dữ liệu về client utf-8
		response.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		UserBean user = (UserBean) session.getAttribute("user_shop_book");

		// Check Login
		if (user == null) {
			response.sendRedirect("AuthController");
		} else {
			ArrayList<CartBean> carts = new ArrayList<CartBean>();
			BookBean book = null;
			CustomerBean customer = null;
			int idCustomer = 0;
			long sumProduct = 0;
			long sumPrice = 0;
			
			try {
				UserBean userBean = userBo.getLogin(user.getUserName(), user.getPassword());
				if (userBean != null) {
					idCustomer = userBean.getIdUser();
				}
				
				String action = (String) request.getParameter("action");
				if (action != null) {
					if (action.equals("update")) {
						int idCart = Integer.parseInt(request.getParameter("idcart"));
						int quantity = Integer.parseInt(request.getParameter("quantity"));
						cartBo.updateCart(idCart, quantity);
					}
					
					
					if (action.equals("delete")) {
						int idCart = Integer.parseInt(request.getParameter("idcart"));
						cartBo.deleteCart(idCart);
					}
					
					if (action.equals("add")) {
						int idBook = Integer.parseInt(request.getParameter("idbook"));
						if (cartBo.checkCart(idBook, idCustomer)) {
							// Update
						} else {
							System.out.print("333333333");
							cartBo.addCart(idBook, idCustomer, 1);
							System.out.print("4444444444");
						}
					}
					
					if (action.equals("order")) {
						cartBo.orderCart(idCustomer);
					}
				}
				
				if (idCustomer != 0) {
					carts = cartBo.getCarts(idCustomer);
					if (carts != null) {
						for (CartBean cartB : carts) {
							if (cartB != null) {
								book = bookBo.getBookByID(cartB.getIdBook());
								user = userBo.getUserByID(cartB.getIdCustomer());
								cartB.setBook(book);
								cartB.setCustomer(customer);
								sumProduct = sumProduct + cartB.getQuantity();
								sumPrice = sumPrice + (cartB.getBook().getPrice() * cartB.getQuantity());
							}
						}
					}
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("sumproducts", sumProduct);
			request.setAttribute("sumprice", sumPrice);
			try {
				request.setAttribute("categories", categoryBo.getCategories());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("carts", carts);
			
			// Gửi về client
			RequestDispatcher rd = request.getRequestDispatcher("Cart.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
