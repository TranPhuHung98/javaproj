<%@page import="java.util.Random"%>
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
   Random r= new Random();
   int n=r.nextInt(201);
%>
<TABLE>
  <TR>
     <TD> <%for(int i=1;i<=n;i++){ %>
           <a href='bcc.jsp?k=<%=i%>'> <%=i %> </a>  
           <%} %>  
      </TD>
  </TR>
   <TR>
     <TD>
     <%
       String st= request.getParameter("k");
      if(st==null) out.print("Vui long cho 1 so: ");
      else{
    	  int so= Integer.parseInt(st);
    	  for(int j=1;j<=10;j++){%>
    		  <%=so %> x <%=j %> = <%=so*j %> <hr>
    		  
      <%}}
      %>
     </TD>
  </TR>
</TABLE>
</body>
</html>