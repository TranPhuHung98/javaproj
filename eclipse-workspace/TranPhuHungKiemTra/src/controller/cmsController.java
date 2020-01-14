//package controller;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import model.bean.UserBean;
//import model.bo.BookBo;
//import model.bo.CategoryBo;
//import model.bo.OrdersBo;
//import model.bo.UserBo;
//
///**
// * Servlet implementation class cmsController
// */
//@WebServlet("/cmsController")
//public class cmsController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private OrdersBo orderBo = new OrdersBo();
//	private UserBo userBo = new UserBo();
////    private CategoryBo categoryBo = new CategoryBo();
//
//	/**
//	 * @see HttpServlet#HttpServlet()
//	 */
//	public cmsController() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		HttpSession session = request.getSession();
//
//		String un = request.getParameter("unadmin");
//		String pw = request.getParameter("pwadmin");
//		
//		UserBean user = null;
//
//		if (un != null) {
//			try {
////				request.setAttribute("orders", orderBo.getOrders());
//				
//				user = userBo.getLogin(un, pw);
//
//				if (user == null) {
//					request.setAttribute("error", "error");
//				}
//				if (user != null) {
//					session.setAttribute("user_cms", user);
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//		if(user!=null && user.isPermission()) {
//			RequestDispatcher rd = request.getRequestDispatcher("cms/pages/dashboard.jsp");
//			rd.forward(request, response);
//		}else {
//			RequestDispatcher rd = request.getRequestDispatcher("cms/pages/login.jsp");
//			rd.forward(request, response);
//		}
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
