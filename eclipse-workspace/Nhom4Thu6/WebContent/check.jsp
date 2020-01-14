<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  String un= request.getParameter("txtun");
String pass= request.getParameter("txtpass");
String vt= request.getParameter("vaitro");
//gv: un: gv pass: 456
if(vt.equals("1") && un.equals("gv")&& 
		pass.equals("456"))
	response.sendRedirect("login.jsp?kt=dung");
else
	response.sendRedirect("login.jsp?kt=sai");
//sv: un: abc, pass:123

%>
</body>
</html>