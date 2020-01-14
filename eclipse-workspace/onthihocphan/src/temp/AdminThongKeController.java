package temp;

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

/**
 * Servlet implementation class AdminThongKeController
 */
@WebServlet("/AdminThongKeController")
public class AdminThongKeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChiTietDotNhanUngHoBo chiTietDotNhanUngHoBo = new ChiTietDotNhanUngHoBo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminThongKeController() {
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


				request.setAttribute("ctdnuhasc", chiTietDotNhanUngHoBo.getListCTDNUH());
//						request.setAttribute("categories", categoryBo.getCategories());

				RequestDispatcher rd = request.getRequestDispatcher("AdmminThongKe.jsp");
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
