package tranphuhungcontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tranphuhungbean.hangbean;
import tranphuhungbo.hangbo;
import tranphuhungdao.hangdao;

/**
 * Servlet implementation class dscontroller
 */
@WebServlet("/dscontroller")
public class dscontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dscontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String search = request.getParameter("search");
		ArrayList<hangbean> ds = new ArrayList<hangbean>();

		hangbo hang = new hangbo();
		hangdao hangDao = new hangdao();
		ds = hang.getSach();
		if (search != null) {
			
			ds = hangDao.getHangByName(search);
		}
		
		request.setAttribute("search", search);
		request.setAttribute("dsHang", ds);
		
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
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
