<%@page import="tranphuhungbean.khoaBean"%>
<%@page import="tranphuhungbean.sinhVienBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Trần Phú Hưng</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Page level plugin CSS-->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin.css" rel="stylesheet">

</head>
<body id="page-top">

	<%
		ArrayList<sinhVienBean> dsSinhVien = (ArrayList<sinhVienBean>) request.getAttribute("dsSinhVien");
		ArrayList<khoaBean> dsKhoa = (ArrayList<khoaBean>) request.getAttribute("dsKhoa");
		String search = (String) request.getAttribute("search");
	%>

	<nav class="navbar navbar-expand navbar-dark bg-dark static-top">

		<a class="navbar-brand mr-1" href="index.html">Sinh Viên</a>

		<button class="btn btn-link btn-sm text-white order-1 order-sm-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>

		<!-- Navbar Search -->
		<form
			class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
			<div class="input-group">
				<input type="text" class="form-control"
					placeholder="Họ tên hoặc địa chỉ" aria-label="Search"
					aria-describedby="basic-addon2" name="search"
					value="<%=search == null ? "" : search%>">>
				<div class="input-group-append">
					<button class="btn btn-primary" type="submit">
						<i class="fas fa-search"></i>
					</button>
				</div>
			</div>
		</form>

	</nav>

	<div id="wrapper">

		<!-- Sidebar -->
		<ul class="sidebar navbar-nav">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="pagesDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-fw fa-folder"></i> <span>Danh
						sách Khoa</span>
			</a>
				<div class="dropdown-menu" aria-labelledby="pagesDropdown">

					<%
						int ss = dsKhoa.size();
						for (int i = 0; i < ss; i++) {
							khoaBean s = dsKhoa.get(i);
					%>
					<a class="dropdown-item" href="controller?mk=<%=s.getMaKhoa()%>"><%=s.getTenKhoa()%></a>
					<%
						}
					%>
					<a class="dropdown-item" href="controller">Tất cả khoa</a>
				</div></li>
			<li class="nav-item active"><a class="nav-link"
				href="controller"> <i class="fas fa-fw fa-table"></i> <span>Danh
						sách sinh viên</span></a></li>
		</ul>

		<div id="content-wrapper">

			<div class="container-fluid">
				<!-- DataTables Example -->
				<div class="card mb-3">
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" width="100%" cellspacing="0">
								<thead>
									<tr>
										<th scope="col">Mã sinh viên</th>
										<th scope="col">Họ tên</th>
										<th scope="col">Địa chỉ</th>
										<th scope="col">Khoa</th>

									</tr>
								</thead>
								<tbody>
									<%
										for (sinhVienBean sv : dsSinhVien) {
									%>

									<tr>
										<td><%=sv.getMaSinhVien()%></td>
										<td><%=sv.getHoTenSinhVien()%></td>
										<td><%=sv.getDiaChi()%></td>
										<td><%=sv.getKhoa().getTenKhoa()%></td>
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

		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- /#wrapper -->



	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Page level plugin JavaScript-->
	<script src="vendor/datatables/jquery.dataTables.js"></script>
	<script src="vendor/datatables/dataTables.bootstrap4.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin.min.js"></script>

	<!-- Demo scripts for this page-->
	<script src="js/demo/datatables-demo.js"></script>

</body>
</html>