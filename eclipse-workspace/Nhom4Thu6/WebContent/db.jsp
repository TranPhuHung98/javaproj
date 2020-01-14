<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <table align='center' width='800'>
  <tr>
  <td>
      <a href='db.jsp?k=ts'> Tin thoi su </a> <hr>
      <a href='db.jsp?k=qt'> Tin quoc te </a> <hr>
      <a href='db.jsp?k=tt'> Tin the thao</a> <hr>
  </td>
  <td>
<%String ts= request.getParameter("k");
 if(ts==null) out.print("Lam on chon 1 muc ....");
 else
	 if(ts.equals("ts"))
		  out.print("ht trang thoi su");
	  else
		  if(ts.equals("tt"))
			  out.print("ht trang the thao");
		  else
			  out.print("ht trang quoc te "); 
 %>
  </td>
  </tr>
  
  </table>
</body>
</html>