<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link href="style.css">
</head>
<body>

	<!-- header scroll -->
	<div class="header" id="myHeader">
		<div class="container clearfix">
			<div class="row">

				<img alt="" src="logo.png" height="60px"
					class="col-md-3 padding-banner-top">
				<div class="input-group col-md-6 padding-input size-input">
					<input type="text" class="form-control" placeholder="Tìm kiếm..."
						aria-describedby="button-addon2" height="60px">
					<div class="input-group-append">
						<button class="btn background-button height-button-search"
							type="button">Tìm kiếm</button>
					</div>
				</div>

				<!-- <input type="text" placeholder="Tìm kiếm..." height="100px">
				<button class="button">Tìm kiếm</button> -->

				<div class="col-md-1 padding-cart">
					<img src="cart.png" height="32">

				</div>
				<div class="col-md-2 padding-input">

					<img src="baohanh.jpg" height="39">
				</div>

			</div>
		</div>
	</div>

	<div class="content">
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-9">
				<!-- <button class="button-list-category  " type="button">DANH
					MỤC SẢN PHẨM</button> -->
				<div class="w3-dropdown-click">
					<button onclick="myFunction()"
						class="button-list-category">
						DANH MỤC SẢN PHẨM<i class="fa fa-caret-down">></i>
					</button>
				</div>
				<div id="Demo"
					class="w3-dropdown-content w3-bar-block w3-border dropdown-item-container">
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/locnuohydrogen.jpg" height="22px" width="22px"> Máy lọc nước Hydrogen</a> 
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/maylocnuocro.jpg" height="22px" width="22px">Máy lọc nước RO Kangaroo</a> 
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/locdaunguon.jpg" height="22px" width="22px">Lọc đầu nguồn - Lọc tinh khiết</a>
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/caynonglanh.jpg" height="22px" width="22px">Cây nóng lạnh Kangaroo</a>
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/tudongtumat.jpg" height="22px" width="22px"> Tủ đông - Tủ mát Kangaroo</a>
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/quatdieuhoa.jpg" height="22px" width="22px">Quạt điều hoà Kangaroo</a>
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/giadung.jpg" height="22px" width="22px"> Gia dụng Kangaroo</a>
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/thietbimuadong.jpg" height="22px" width="22px"> Thiết bị mùa đông Kangaroo</a>
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/thietbinhabep.jpg" height="22px" width="22px"> Thiết bị nhà bếp Kangaroo</a>
					<a href="#" class="w3-bar-item"><img alt="" src="image-category/tbivesinh.jpg" height="22px" width="22px">Thiết bị vệ sinh Kangaroo</a>
				</div>
				<img alt="" src="banner_top.png" height="50px">
			</div>
			<div class="col-md-2"></div>
		</div>
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-7 slideshow-container ">
				<div class="mySlides fade">

					<img src="slide1.jpg" style="width: 100%">

				</div>
				<div class="mySlides fade">

					<img src="slide2.jpg" style="width: 100%">

				</div>
			</div>
			<div class="col-md-2 padding-banner-top">
				<img alt="" src="banner_top_1.jpg"> <img alt=""
					src="banner_top_2.jpg">
			</div>

		</div>
	</div>

	<!-- scroll down header -->
	<script>
		window.onscroll = function() {
			stickyFunction()
		};

		var header = document.getElementById("myHeader");
		var sticky = header.offsetTop;

		function stickyFunction() {
			if (window.pageYOffset > sticky) {
				header.classList.add("sticky");
			} else {
				header.classList.remove("sticky");
			}
		}
	</script>

	<!-- slide show -->
	<script>
		var slideIndex = 0;
		showSlides();

		function showSlides() {
			var i;
			var slides = document.getElementsByClassName("mySlides");

			for (i = 0; i < slides.length; i++) {
				slides[i].style.display = "none";
			}
			slideIndex++;
			if (slideIndex > slides.length) {
				slideIndex = 1
			}

			slides[slideIndex - 1].style.display = "block";

			setTimeout(showSlides, 5000); // Change image every 2 seconds
		}
	</script>

	<!-- Drop down -->
	<script>
		function myFunction() {
			var x = document.getElementById("Demo");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
	</script>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>