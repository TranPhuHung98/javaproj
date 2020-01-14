<%@page import="bo.SinhVienBo"%>
<%@page import="bean.SinhVienBean"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%-- <%@page import="model.bean.UserBean"%> --%>
<!DOCTYPE html>

<%-- <%@page import="model.bean.CategoryBean"%>
<%@page import="model.bean.BookBean"%> --%>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Sinh Viên</title>

<!-- Custom fonts for this template -->
<link href="Content/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="Content/vendor/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link href="Content/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">

</head>

<body id="page-top">

	<%
		System.out.print(LocalDate.now());
		SinhVienBean sinhVien = null;
		SinhVienBo svbo = new SinhVienBo();
		/* if (request.getAttribute("rsAdd") != null) {
			out.print("<script>alert('Không thêm được.');</script>");
		}

		if (request.getAttribute("rsUpdate") != null) {
			out.print("<script>alert('Không sửa được.');</script>");
		}

		if (request.getAttribute("rsDelete") != null) {
			out.print("<script>alert('Không xóa được.');</script>");
		}
		if (request.getAttribute("svSelect") != null) {
			monHoc = (MonHocBean) request.getAttribute("svSelect");
		} */

		ArrayList<SinhVienBean> dsSinhVien = (ArrayList<SinhVienBean>) request.getAttribute("sinhviens");
	%>

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="MonHocController">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</div>
				<div class="sidebar-brand-text mx-2">Dashboard</div>
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<li class="nav-item "><a class="nav-link"
				href="MonHocController"> <i class="fas fa-fw fa-book"></i> <span>Môn
						học</span></a></li>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<li class="nav-item active"><a class="nav-link"
				href="SinhVienController"> <i class="fas fa-fw fa-list-ul"></i>
					<span>Sinh viên</span></a></li>

			<hr class="sidebar-divider my-0">

			<li class="nav-item"><a class="nav-link"
				href="ThongKeController"> <i class="fas fa-fw fa-shopping-cart"></i>
					<span>Thống kê</span></a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>

					<!-- Topbar Search -->
					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">

					</form>

					<!-- Topbar Navbar -->
					<ul class="navbar-nav ml-auto">

						<!-- Nav Item - User Information -->
						<li class="nav-item dropdown no-arrow"><a
							class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small">
									Admin </span> <img class="img-profile rounded-circle"
								src="https://scontent.fdad3-2.fna.fbcdn.net/v/t1.0-9/70854715_1498736743613880_8940053685950480384_o.jpg?_nc_cat=104&_nc_eui2=AeEcetGdEOGjEzLoidZuvCxX6u3eX18HZYC3nsIUmtZwdQEviHjt4VTlHrgsU9uuVKc7iHd1bYboeTo_1z7KQr4-rN-7qS_k3e6m8FCMK3Mckg&_nc_ohc=Yv9rFFOT73sAQnpHyjcavctNkpw56zaYCbCBb7CYclUSzomfN_9b0clCA&_nc_ht=scontent.fdad3-2.fna&oh=9272b91773fcb328a0387b7fb6062bb2&oe=5EAB7D2F">
						</a> <!-- Dropdown - User Information -->
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
								aria-labelledby="userDropdown">
								<!-- <a class="dropdown-item" href="#">
                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                  Profile
                </a>
                <a class="dropdown-item" href="#">
                  <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                  Settings
                </a>
                <a class="dropdown-item" href="#">
                  <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                  Activity Log
                </a>
                <div class="dropdown-divider"></div> -->
								<a class="dropdown-item" href="logout.php" data-toggle="modal"
									data-target="#logoutModal"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
									Logout
								</a>
							</div></li>

					</ul>

				</nav>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					

					<%-- <form action="MonHocController" method="post">
						<div class="form-group">
							<label>Mã Môn học: </label> <input type="text"
								class="form-control" name="txtmasv"
								value="<%=monHoc == null ? "" : monHoc.getMasv()%>"> <label
								class="mt-3">Tên Môn học: </label> <input type="text"
								class="form-control" name="txttensv"
								value="<%=monHoc == null ? "" : monHoc.getTensv()%>"> <label
								class="mt-3">Số tín chỉ: </label> <input type="number"
								class="form-control" name="txtstc"
								value="<%=monHoc == null ? "" : monHoc.getSoTinChi()%>">
							<label class="mt-3">Số buổi: </label> <input type="number"
								class="form-control" name="txtsb"
								value="<%=monHoc == null ? "" : monHoc.getSoBuoi()%>"> <label
								class="mt-3">Số SV tối thiểu: </label> <input type="number"
								class="form-control" name="txtssvtt"
								value="<%=monHoc == null ? "" : monHoc.getSoSVToiThieu()%>">
							<label class="mt-3">Số SV tối đa: </label> <input type="number"
								class="form-control" name="txtssvtd"
								value="<%=monHoc == null ? "" : monHoc.getSoSVToiDa()%>">
							<label class="mt-3">Số SV đã đăng ký: </label> <input
								type="number" class="form-control" name="txtssvdk"
								value="<%=monHoc == null ? "" : monHoc.getSoSVDangKy()%>">
							<label class="mt-3">Ngày nhập học: </label> <input type="date"
								class="form-control" name="txtnnh"
								value="<%=monHoc == null ? "" : monHoc.getNgayNhapHoc()%>">
							<label class="mt-3">Ngày hết hạn: </label> <input type="date"
								class="form-control" name="txtndk"
								value="<%=monHoc == null ? "" : monHoc.getNgayHetHang()%>">
						</div>
						<button type="submit" class="btn btn-primary" name="btnAdd"
							value="1">Thêm</button>
						<button type="submit" class="btn btn-primary" name="btnUpdate"
							value="1">Cập nhật</button>
					</form> --%>
					<h1 style="padding-top: 20px" class="h3 mb-2 text-gray-800 mb-3">Danh sách Sinh viên</h1>
					<!-- DataTales Example -->
					<div class="card shadow mb-3 mt-3">
						<div class="card-body">
							<div class="table-responsive">
								<table class="table table-bordered" id="dataTable" width="100%"
									cellspacing="0">
									<thead>
										<tr>
											<th>Mã sv</th>
											<th>Tên sv</th>
											<th>Ngày sinh</th>
											<th>Giới tính</th>
											<th>Địa chỉ</th>
											<th>Lớp</th>
											<th>Email</th>
											<th>Số điện thoại</th>
											<th>So tc</th>
										</tr>
									</thead>
									<tfoot>
										<tr>
											<th>Mã sv</th>
											<th>Tên sv</th>
											<th>Ngày sinh</th>
											<th>Giới tính</th>
											<th>Địa chỉ</th>
											<th>Lớp</th>
											<th>Email</th>
											<th>Số điện thoại</th>
											<th>So tc</th>
										</tr>
									</tfoot>
									<tbody>
										<%
											for (SinhVienBean sv : dsSinhVien) {
										%>
										<tr>
											<td><%=sv.getMaSV()%></td>

											<td><%=sv.getHoTen()%></td>
											<td><%=sv.getNgaySinh() + ""%></td>
											<td><%=sv.getGioiTinh()%></td>
											<td><%=sv.getDiaChi()%></td>
											<td><%=sv.getLop()%></td>
											<td><%=sv.getEmail()%></td>
											<td><%=sv.getSoDienThoai()%></td>
											<td><%=svbo.getSumTinChiById(sv.getMaSV())%></td>

										</tr>
										<%
											}
										%>
									</tbody>
								</table>
							</div>
						</div>
					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; Your Website 2019</span>
					</div>
				</div>
			</footer>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="AuthController?logout=true">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="Content/vendor/jquery/jquery.min.js"></script>
	<script src="Content/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="Content/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="Content/vendor/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="Content/vendor/datatables/jquery.dataTables.min.js"></script>
	<script src="Content/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="Content/vendor/js/demo/datatables-demo.js"></script>

</body>

</html>