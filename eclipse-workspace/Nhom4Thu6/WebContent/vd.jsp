<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=session.getAttribute("ss") %>
<% //lay ve gia tri cua cac bien request
  long s=(long)request.getAttribute("gt1");
  String gt2=(String)request.getAttribute("gt2");
  String[] ds=(String[]) request.getAttribute("dsht");
%>
Gt1: <%=s %> <hr>
Gt2: <%=gt2 %> <hr>
Danh sach ten: <br>
<%for(String ht: ds){
	out.print(ht+"<br>");
}
	%>


</body>
</html>