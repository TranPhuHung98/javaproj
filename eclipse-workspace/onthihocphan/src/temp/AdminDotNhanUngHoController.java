package temp;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminDotNhanUngHoController
 */
@WebServlet("/AdminDotNhanUngHoController")
public class AdminDotNhanUngHoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DotNhanUngHoBo dotNhanUngHoBo = new DotNhanUngHoBo();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminDotNhanUngHoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Lấy dữ liệu từ client utf-8
		request.setCharacterEncoding("utf-8");
		// Gửi dữ liệu về client utf-8
		response.setCharacterEncoding("utf-8");

		String maDNUH = null;
		String maHoDan = null;
		Date ngayNUH = null;
		Boolean isUpdate = false;
		Boolean isAdd = false;

		HttpSession session = request.getSession();

//		if (isUpdate) {
//			if (!maDNUH.equals("") && !maHoDan.equals("") &&  !ngayNUH.equals("")) {
//				
//				SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
////				Date date = f.parse(dateInput);
//				int rsUpdate = dotNhanUngHoBo. .updateBook(Integer.parseInt(iDBook), name, Integer.parseInt(price),
//						Integer.parseInt(iDCategory), image, author);
//				if (rsUpdate == 0)
//					request.setAttribute("rsUpdate", 0);
//			} else {
//				request.setAttribute("rsUpdate", 0);
//			}
//
//		}
//
//		if (isAdd) {
//			if (image == null)
//				image = "image_sach/default.png";
//			if (!name.equals("")  && !price.equals("") && !iDCategory.equals("")
//					&& !author.equals("")) {
//				SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
////				Date sqlDate = null;
////				if (dateInput.equals("")) {
////					sqlDate = f.parse(dateInput);
////				} else {
////					sqlDate = f.parse(dateInput);
////				}
//				int rsAdd = bookBo.addBook(Integer.parseInt(iDBook), name, Integer.parseInt(price),
//						Integer.parseInt(iDCategory), image, author);
//				if (rsAdd == 0)
//					request.setAttribute("rsAdd", 0);
//			} else {
//				request.setAttribute("rsAdd", 0);
//			}
//
//		}
		System.out.print(request.getParameter("delete"));
		if (request.getParameter("delete") != null) {
			System.out.print("asdfsfdsdfsdsdsdfsdfsdfsdf");
			int rsDelete = 0;
			try {
				rsDelete = dotNhanUngHoBo.deleteDotNUH(request.getParameter("delete"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (rsDelete == 0)
				request.setAttribute("rsDelete", 0);
		}

		if (request.getParameter("select") != null) {
			try {
				request.setAttribute("dotnuhSelect",
						dotNhanUngHoBo.getDotNUHById(request.getParameter("select")));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		request.setAttribute("dotnuhs", dotNhanUngHoBo.getListDotNUH());
//		request.setAttribute("categories", categoryBo.getCategories());


		RequestDispatcher rd = request.getRequestDispatcher("AdminDotNhanUngHo.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
