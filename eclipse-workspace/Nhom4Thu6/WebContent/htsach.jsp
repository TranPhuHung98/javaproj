<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.sachbean"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center" width="1000">
 <td valign="top" width="200"> 
 <table>
  <%ArrayList<loaibean> dsloai=
  (ArrayList<loaibean>)request.getAttribute("dsloai");
  for(loaibean l: dsloai){
   %>
     <tr>
       <td>
        <a href="sachcontroller?ml=<%=l.getMaloai()%>">
          <%=l.getTenloai() %>
         </a> 
        </td>
      </tr>
     <%} %>
   </table>
   </td>
 <td>
 <TABLE align='center' width='600'>
 
      <%
       
   ArrayList<sachbean> ds=( ArrayList<sachbean>)
      request.getAttribute("dssach");
      int ss=ds.size();
        for(int i=0;i<ss;i++){
           sachbean s=ds.get(i);
         %>
         <TR>
           <td><img src='<%=s.getAnh() %>' height="200"> <br>
                <%=s.getTensach() %> <br>
                <%=s.getGia() %> <br>
               <a href="mua.jsp?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>">
                <img src='mua.jpg'></a> <hr>
            </Td>
            <%i++;
              if(i<ss){
            	  s=ds.get(i);%>
             <td><img src='<%=s.getAnh() %>' height="200"> <br>
                <%=s.getTensach() %> <br>
                <%=s.getGia() %> <br>
                <a href="mua.jsp?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>">
                <img src='mua.jpg'></a> <hr>
            </Td>
            <%} %>
         </TR>  
   <%} %>
  </TABLE>    </td>
 <td valign="top" width="200">TK</td>
</table>
</body>
</html>