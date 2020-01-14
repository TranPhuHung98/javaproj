<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
    
          <li><a href="t1.jsp">Trang 1</a></li>
          <li><a href="t2.jsp">Trang 2</a></li>
         <li><a href="dangnhap.jsp"><span class="glyphicon glyphicon-user"></span> Dang nhap</a></li>
      <li><a href="dangxuat.jsp"><span class="glyphicon glyphicon-log-in"></span> Dang xuat</a></li>
    </ul>
     
   
  </div>
</nav>
  
<div class="container">

  <form action="ktdncontroller?kt=1" method='post'>
    un: <input type='text' name='txtun' class="form-control"><br>
    pass: <input type='password' name='txtpass' class="form-control"><br>
    <input type='submit' name='but1' value='Login' class="btn-primary">
  </form>
<a href="ktdncontroller?kt=2"> goi len servelet </a>
</div>

</body>
</html>