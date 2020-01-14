<%@page import="tranphuhungdao.hangdao"%>
<%@page import="tranphuhungbean.hangbean"%>
<%@page import="tranphuhungbo.hangbo"%>
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
		/* String search = request.getParameter("search");
		ArrayList<hangbean> ds;

		hangbo hang = new hangbo();
		hangdao hangDao = new hangdao();
		ds = hang.getSach();
		if (search != null) {
			ds = hangDao.getHangByName(search);
		} */
		String search =(String) request.getAttribute("search");
		ArrayList<hangbean> ds =(ArrayList<hangbean>) request.getAttribute("dsHang");
	%>

	<nav class="navbar navbar-dark bg-dark">
		
		<a class="navbar-brand" href="#">Navbar</a>

		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search" name="search" value="<%=search == null ? "" : search%>">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>

	</nav>

	<%
		if (ds.isEmpty()) {
	%>
	<div>Không có sách nào phù hợp</div>
	<%
		} else {
	%>
	<div class="row">

		<%
			int ss = ds.size();
				for (int i = 0; i < ss; i++) {
					hangbean s = ds.get(i);
		%>


		<div class="card col-6">
			<img src="<%=s.getAnh()%>" class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">
					Mã hàng:
					<%=s.getMaHang()%></h5>
				<p class="card-text">
					Tên Hàng:
					<%=s.getTenHang()%></p>
				<a href="controller?mh=<%=s.getMaHang()%>" class="btn btn-primary">Xem
					chi tiết</a>
			</div>
		</div>
		<%
			}
		%>

	</div>
	<%
		}
	%>

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