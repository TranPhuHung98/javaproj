<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="tinh.jsp" method='post'>
   n=<input type='number' name='txtn'> <br>
   <input type='submit' name='but1' value='Tong'> <br>
</form>
<%  out.print("Tong: "+session.getAttribute("ss") ); %>
</body>
</html>