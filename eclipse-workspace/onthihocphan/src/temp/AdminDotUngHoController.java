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
 * Servlet implementation class AdminDotUngHoController
 */
@WebServlet("/AdminDotUngHoController")
public class AdminDotUngHoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DotUngHoBo dotUngHoBo = new DotUngHoBo();
	private ChiTietDotUngHoBo chiTietDUHBo = new ChiTietDotUngHoBo();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminDotUngHoController() {
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

		String maDUH = null;
		String maDVUH = null;
		Date ngayUH = null;
		String hinhThucUH = null;
		int soLuong = 0;
		String donViTinh = null;

		Boolean isUpdate = request.getParameter("txtmaduh") == null ? false : true;
		Boolean isAdd = false;

		HttpSession session = request.getSession();
		System.out.println("roi ha" + isUpdate.toString());
		if (request.getParameter("btnUpdate") != null) {
			System.out.println("chay duo roiiiiiiii");
			maDUH = request.getParameter("txtmaduh");
			maDVUH = request.getParameter("txtmadvuh");
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			try {
				System.out.println("chay date" + request.getParameter("txtngayuh"));
				ngayUH = (Date) f.parse(request.getParameter("txtngayuh"));
				System.out.println("chay date" + ngayUH);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			hinhThucUH = request.getParameter("txthtuh");
			soLuong = Integer.parseInt(request.getParameter("txtsluh"));
			donViTinh = request.getParameter("txtdvt");
			if (!maDUH.equals("") && !maDVUH.equals("")) {

//						SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
//						Date date = f.parse(dateInput);
				int rsUpdate = 0;
				try {
					rsUpdate = dotUngHoBo.updateDotUH(maDUH, maDVUH, ngayUH);
					chiTietDUHBo.updateCTDUH(maDUH, hinhThucUH, soLuong, donViTinh);
				} catch (Exception e) {
					// TODO Auto-generated catch block
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
			maDUH = request.getParameter("txtmaduh");
			maDVUH = request.getParameter("txtmadvuh");
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			try {
				System.out.println("chay date" + request.getParameter("txtngayuh"));
				ngayUH = (Date) f.parse(request.getParameter("txtngayuh"));
				System.out.println("chay date" + ngayUH);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			hinhThucUH = request.getParameter("txthtuh");
			soLuong = Integer.parseInt(request.getParameter("txtsluh"));
			donViTinh = request.getParameter("txtdvt");
			if (!maDUH.equals("") && !maDVUH.equals("")) {

//						SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
//						Date date = f.parse(dateInput);
				int rsAdd = 0;
				try {
					rsAdd = dotUngHoBo.addDotNUH(maDUH, maDVUH, ngayUH);
					chiTietDUHBo.addCTDUH(maDUH, hinhThucUH, soLuong, donViTinh);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (rsAdd == 0)
					request.setAttribute("rsAdd", 0);
			} else {
				request.setAttribute("rsAdd", 0);
			}

		}
		//
//				if (isAdd) {
//					if (image == null)
//						image = "image_sach/default.png";
//					if (!name.equals("")  && !price.equals("") && !iDCategory.equals("")
//							&& !author.equals("")) {
//						SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
////						Date sqlDate = null;
////						if (dateInput.equals("")) {
////							sqlDate = f.parse(dateInput);
////						} else {
////							sqlDate = f.parse(dateInput);
////						}
//						int rsAdd = bookBo.addBook(Integer.parseInt(iDBook), name, Integer.parseInt(price),
//								Integer.parseInt(iDCategory), image, author);
//						if (rsAdd == 0)
//							request.setAttribute("rsAdd", 0);
//					} else {
//						request.setAttribute("rsAdd", 0);
//					}
		//
//				}
//				System.out.print(request.getParameter("delete"));
//				if (request.getParameter("delete") != null) {
//					System.out.print("asdfsfdsdfsdsdsdfsdfsdfsdf");
//					int rsDelete = 0;
//					try {
//						rsDelete = dotUngHoBo.deleteDotUH(request.getParameter("delete"));
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					if (rsDelete == 0)
//						request.setAttribute("rsDelete", 0);
//				}

		if (request.getParameter("select") != null) {
			System.out.print("aasdasdahvsf ajsdsdss");
			try {
				request.setAttribute("dotuhSelect", dotUngHoBo.getDotUHById(request.getParameter("select")));
				request.setAttribute("chitietdotuhSelect", chiTietDUHBo.getDotUHById(request.getParameter("select")));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		request.setAttribute("dotuhs", dotUngHoBo.getListDotUH());
//				request.setAttribute("categories", categoryBo.getCategories());

		RequestDispatcher rd = request.getRequestDispatcher("AdminDotUngHo.jsp");
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
