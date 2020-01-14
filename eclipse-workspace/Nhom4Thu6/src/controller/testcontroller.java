package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class testcontroller
 */
@WebServlet("/testcontroller")
public class testcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Tao ra doi tuong out
		PrintWriter out = response.getWriter();
		//out.print("<html><body>Hello Servlet</body></html>");
		//Tao ra 1 session
		HttpSession session= request.getSession();
		session.setAttribute("ss","ha ha");
		//Tao ra 3 bien request: 
		request.setAttribute("gt1",(long)4*5);
		request.setAttribute("gt2","le Thanh an");
		String[] ds= {"Nam","binh","lan","Thu","Tien"};
		request.setAttribute("dsht", ds);
		//truyen 3 bien nay ve trang vd.jsp:
		//b1: Dieu huong ve trang vd.jsp
		   //response.sendRedirect("vd.jsp");
		RequestDispatcher rd= 
				request.getRequestDispatcher("vd.jsp");
		rd.forward(request, response);
	}
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
