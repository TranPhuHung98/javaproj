<%@page import="tranphuhungbean.hangbean"%>
<%@page import="tranphuhungdao.hangdao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String maHang = request.getParameter("mh");
		hangdao hangDao = new hangdao();
		hangbean detailHang = hangDao.getHangById(Integer.parseInt(maHang));
	%>
	<div class="card col-6">
			<img src="<%=detailHang.getAnh()%>" class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">
					Tên hàng:
					<%=detailHang.getTenHang()%></h5>
				<p class="card-text">
					Mô tả:
					<%=detailHang.getDes()%></p>
				<%-- <a href="detail.jsp?mh=<%=s.getMaHang()%>" class="btn btn-primary">Xem chi tiết</a> --%>
			</div>
		</div>

</body>
</html>