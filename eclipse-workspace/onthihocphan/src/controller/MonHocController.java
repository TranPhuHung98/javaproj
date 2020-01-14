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

import bo.MonHocBo;

/**
 * Servlet implementation class MonHocController
 */
@WebServlet("/MonHocController")
public class MonHocController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MonHocBo monHocBo = new MonHocBo();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MonHocController() {
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

		String maMH = null;
		String tenMH = null;
		int soTC = 0;
		int soB = 0;
		int soSVTT = 0;
		int soSVTD = 0;
		int soSVDK = 0;
		Date ngayNH = null;
		Date ngayDK = null;

		HttpSession session = request.getSession();
		
		if (request.getParameter("btnUpdate") != null) {
			System.out.println("chay duo roiiiiiiii");
			maMH = request.getParameter("txtmamh");
			tenMH = request.getParameter("txttenmh");
			soTC = Integer.parseInt(request.getParameter("txtstc"));
			soB = Integer.parseInt(request.getParameter("txtsb"));
			soSVTT = Integer.parseInt(request.getParameter("txtssvtt"));
			soSVTD = Integer.parseInt(request.getParameter("txtssvtd"));
			soSVDK = Integer.parseInt(request.getParameter("txtssvdk"));
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			try {
				System.out.println("chay date" + request.getParameter("txtngayuh"));
				ngayNH = (Date) f.parse(request.getParameter("txtnnh"));
				ngayDK = (Date) f.parse(request.getParameter("txtndk"));

			} catch (ParseException e1) {
				e1.printStackTrace();
			}

			if (!maMH.equals("") && !tenMH.equals("")) {
				int rsUpdate = 0;
				try {
					rsUpdate = monHocBo.updateDotUH(maMH, tenMH, soTC, soB, soSVTT, soSVTD, soSVDK, ngayNH, ngayDK);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (rsUpdate == 0)
					request.setAttribute("rsUpdate", 0);
			} else {
				request.setAttribute("rsUpdate", 0);
			}

		}
		if (request.getParameter("btnAdd") != null) {
			System.out.println("chay duo roiiiiiiii");
			maMH = request.getParameter("txtmamh");
			tenMH = request.getParameter("txttenmh");
			soTC = Integer.parseInt(request.getParameter("txtstc"));
			soB = Integer.parseInt(request.getParameter("txtsb"));
			soSVTT = Integer.parseInt(request.getParameter("txtssvtt"));
			soSVTD = Integer.parseInt(request.getParameter("txtssvtd"));
			soSVDK = Integer.parseInt(request.getParameter("txtssvdk"));
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			try {
				System.out.println("chay date" + request.getParameter("txtngayuh"));
				ngayNH = (Date) f.parse(request.getParameter("txtnnh"));
				ngayDK = (Date) f.parse(request.getParameter("txtndk"));

			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			if (!maMH.equals("") && !tenMH.equals("")) {
				int rsAdd = 0;
				try {
					rsAdd = monHocBo.addDotNUH(maMH, tenMH, soTC, soB, soSVTT, soSVTD, soSVDK, ngayNH, ngayDK);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (rsAdd == 0)
					request.setAttribute("rsAdd", 0);
			} else {
				request.setAttribute("rsAdd", 0);
			}

		}
		System.out.print(request.getParameter("delete"));
		if (request.getParameter("delete") != null) {
			int rsDelete = 0;
			try {
				rsDelete = monHocBo.deleteDotNUH(request.getParameter("delete"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (rsDelete == 0)
				request.setAttribute("rsDelete", 0);
		}
		if (request.getParameter("select") != null) {
			System.out.print("aasdasdahvsf ajsdsdss");
			try {
				request.setAttribute("mhSelect", monHocBo.getMonHocById(request.getParameter("select")));

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		request.setAttribute("monhocs", monHocBo.getListDotUH());

		RequestDispatcher rd = request.getRequestDispatcher("MonHoc.jsp");
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
