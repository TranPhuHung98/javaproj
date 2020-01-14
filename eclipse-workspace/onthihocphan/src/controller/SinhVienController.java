package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.SinhVienBo;

/**
 * Servlet implementation class SinhVienController
 */
@WebServlet("/SinhVienController")
public class SinhVienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SinhVienBo svBo = new SinhVienBo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SinhVienController() {
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

				request.setAttribute("sinhviens", svBo.getListSV());

				RequestDispatcher rd = request.getRequestDispatcher("SinhVien.jsp");
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
