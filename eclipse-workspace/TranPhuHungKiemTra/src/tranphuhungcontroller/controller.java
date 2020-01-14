package tranphuhungcontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tranphuhungbean.khoaBean;
import tranphuhungbean.sinhVienBean;
import tranphuhungbo.khoaBo;
import tranphuhungbo.sinhVienBo;

/**
 * Servlet implementation class controller
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public controller() {
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
		String maKhoa = request.getParameter("mk");
		String search = request.getParameter("search");
		sinhVienBo svBo = new sinhVienBo();
		ArrayList<sinhVienBean> dsSV = new ArrayList<sinhVienBean>();
		khoaBo kBo = new khoaBo();
		ArrayList<khoaBean> dsKhoa = kBo.getKhoa();
		

		if (search == null)
			dsSV = maKhoa == null ? svBo.getSinhVien() : svBo.getSinhVienByMaKhoa(maKhoa);
		else
			dsSV = svBo.getSinhVienByHoTenDiaChi(search);
		
		request.setAttribute("dsSinhVien", dsSV);
		request.setAttribute("dsKhoa", dsKhoa);
		request.setAttribute("search", search);
		RequestDispatcher rd = request.getRequestDispatcher("home2.jsp");
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
