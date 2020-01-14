<%@page import="tranphuhungbean.sinhVienBean"%>
<%@page import="tranphuhungdao.sinhVienDao"%>
<%@page import="tranphuhungbo.sinhVienBo"%>
<%@page import="tranphuhungdao.khoaDao"%>
<%@page import="tranphuhungbo.khoaBo"%>
<%@page import="tranphuhungbean.khoaBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css"
	integrity="sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt"
	crossorigin="anonymous">
</head>
<body>

	<%	
		ArrayList<sinhVienBean> dsSinhVien = (ArrayList<sinhVienBean>) request.getAttribute("dsSinhVien");
		ArrayList<khoaBean> dsKhoa = (ArrayList<khoaBean>) request.getAttribute("dsKhoa");
		String search = (String) request.getAttribute("search");
	%>

	<nav class="navbar navbar-dark bg-dark">

		<a class="navbar-brand" href="#"></a>

		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Họ tên hoặc địa chỉ" aria-label="Search" name="search"
				value="<%=search == null ? "" : search%>">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>

	</nav>
	<div class="row" style="padding-left: 15px;">
		<div class="list-group">
			<%
				int ss = dsKhoa.size();
				for (int i = 0; i < ss; i++) {
					khoaBean s = dsKhoa.get(i);
			%>

			
			<li class="list-group-item"><a href="controller?mk=<%=s.getMaKhoa()%>"><%=s.getTenKhoa()%></a></li>

			<%
				}
			%>
			
			<li class="list-group-item"><a href="controller">Tất cả</a></li>
		</div>
		<div>
			<table class="table table-bordered">
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

	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/js/bootstrap.min.js"
		integrity="sha384-3qaqj0lc6sV/qpzrc1N5DC6i1VRn/HyX4qdPaiEFbn54VjQBEU341pvjz7Dv3n6P"
		crossorigin="anonymous"></script>
</body>
</html>