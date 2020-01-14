package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.BookBean;
import model.bean.Orders;
import model.bean.OrderBean;
import model.bean.OrderDetailBean;
import model.bean.CustomerBean;
import model.bean.UserBean;
import model.bo.BookBo;
import model.bo.CustomerBo;
import model.bo.OrderManagerBo;
import model.bo.UserBo;

/**
 * Servlet implementation class AdminOrderManagerController
 */
@WebServlet("/AdminOrderManagerController")
public class AdminOrderManagerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private OrderManagerBo orderManagerBo = new OrderManagerBo();
    private CustomerBo customerBo = new CustomerBo();
    private UserBo userBo = new UserBo();
    private BookBo bookBo = new BookBo();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminOrderManagerController() {
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
		
		ArrayList<Orders> ordersConfirmed = new ArrayList<Orders>();
		ArrayList<Orders> ordersUnConfirm = new ArrayList<Orders>();
		ArrayList<OrderBean> orderBeansConfirmed = new ArrayList<OrderBean>();
		ArrayList<OrderBean> orderBeansUnConfirm = new ArrayList<OrderBean>();
		OrderDetailBean orderDetail = null;
		BookBean book = null;
		UserBean userBeanAll = null;
		
		try {
			HttpSession session = request.getSession();
			UserBean user = (UserBean) session.getAttribute("user_shop_book");
			
			// Check Login
			if (user == null) {
				response.sendRedirect("AuthController");
			} else {
				if (user.isPermission()) {
					if (request.getParameter("confirm") != null) {
						int rsConfirm = orderManagerBo.confirmOrder(Long.parseLong(request.getParameter("confirm")));
						if (rsConfirm == 0) request.setAttribute("rsConfirm", 0);
					}
						
					orderBeansUnConfirm = orderManagerBo.getOrderUnConfirm();
					if (orderBeansUnConfirm != null) {
						for (OrderBean orderBean : orderBeansUnConfirm) {
							if (orderBean != null) {
								userBeanAll = userBo.getUserByID(orderBean.getIdCustomer()) ;
								orderDetail = orderManagerBo.getOrderDetailByID(orderBean.getIdOrders());
								if (orderDetail != null) {
									book = bookBo.getBookByID(orderDetail.getIdBook());	
									Orders Unorder = new Orders(orderBean, orderDetail, book, userBeanAll);
									ordersUnConfirm.add(Unorder);
								}
							}
						}
					}
					
					orderBeansConfirmed = orderManagerBo.getOrderConfirmed();
					if (orderBeansConfirmed != null) {
						for (OrderBean orderBean : orderBeansConfirmed) {
							if (orderBean != null) {
								userBeanAll = userBo.getUserByID(orderBean.getIdCustomer());
								orderDetail = orderManagerBo.getOrderDetailByID(orderBean.getIdOrders());
								if (orderDetail != null) {
									book = bookBo.getBookByID(orderDetail.getIdBook());	
									Orders order = new Orders(orderBean, orderDetail, book, userBeanAll);
									ordersConfirmed.add(order);
								}
							}
						}
					}
					
					request.setAttribute("unconfirm", ordersUnConfirm);
					request.setAttribute("confirmed", ordersConfirmed);
					
					RequestDispatcher rd = request.getRequestDispatcher("AdminOrderManager.jsp");
					rd.forward(request, response);
				} else {
					response.sendRedirect("HomeController");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
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
