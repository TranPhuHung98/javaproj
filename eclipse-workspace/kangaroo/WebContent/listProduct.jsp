<%@ page language="java"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<style>
	.product-border{
		border-style:ridge ;
		 border-width: 1px;
	}
	/*border cho sản phẩm*/
	.sale-flash {
    position: absolute;
    top: 0px;
    left: 0px;
    padding: 3px 8px;
    background-color: #ff9900;
    color: #FFF;
    border-radius: 2px;
	}
/* css cho phần trăm ô giảm giá*/
	.product-price del{
		color: #888 ;
		font-size: 15px;
		padding-left: 10px;
	}
/* css cho giá cũ giá cao hơn trong thẻ del*/
	.product-price p{
		color: red ;
		font-size: 18px;
		padding-left: 10px;
		font-weight: 600;

	}
/* css cho giá đã giảm giá của product trong thẻ p*/
	.product-image{
		position: relative;
		width: 100%
	 	/* overflow: hidden;  */
	}
/*	cho phần trăm giảm giá nằm trên ảnh*/
	.product-title h4{
		font-size: 14px ;
		text-align : center ;
	}
/* css cho tên của sản phẩm*/
</style>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<div class="col-7 row">
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/100hc-12ce4abb-7be4-467a-a1ad-52fe10e0755b.jpg?v=1558357419000">
					</div>
					<div class="sale-flash">- 28%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>8.290.000₫</p>
					<del>11.500.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Tủ đông kháng khuẩn Kangaroo KG428IC1</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/kg100hbkv-hn-3a74b1c8-7559-46eb-9a51-d6c1a3f7338e.jpg?v=1552208940000">
					</div>
					<div class="sale-flash">- 28%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>7.000.000₫</p>
					<del>8.500.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Máy lọc nước Kangaroo Hydrogen KG100HG không vỏ</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/kg100hb-hn.jpg?v=1548813173000">
					</div>
					<div class="sale-flash">- 28%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>7.290.000₫</p>
					<del>10.000.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Máy lọc nước Kangaroo Hydrogen KG100HG không vỏ</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/kg100hbkv-hn.jpg?v=1552207502000">
					</div>
					<div class="sale-flash">- 14%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>6.290.000₫</p>
					<del>8.500.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Máy lọc nước Kangaroo Hydrogen KG100HG không vỏ</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/110vtu-jpg.png?v=1552919472000">
					</div>
					<div class="sale-flash">- 17%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>5.290.000₫</p>
					<del>6.500.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Tủ đông kháng khuẩn Kangaroo KG268A2</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/kg100hb-hn.jpg?v=1548813173000">
					</div>
					<div class="sale-flash">- 20%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>5.300.500₫</p>
					<del>9.320.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Máy làm rau mầm Kangaroo KG261</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/100hc-12ce4abb-7be4-467a-a1ad-52fe10e0755b.jpg?v=1558357419000">
					</div>
					<div class="sale-flash">- 15%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>8.690.000₫</p>
					<del>9.450.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Máy làm sữa chua Kangaroo KG80</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/kg100hbkv-hn.jpg?v=1552207502000">
					</div>
					<div class="sale-flash">- 29%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>8.290.000₫</p>
					<del>11.500.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Máy lọc nước Kangaroo 9 lõi không vỏ tủ KG109</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/110kv.jpg?v=1533700457660">
					</div>
					<div class="sale-flash">- 31%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>11.290.000₫</p>
					<del>13.500.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Quạt phun sương Kangaroo KG56B (KG586B)</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/110vtu-jpg.png?v=1552919472000">
					</div>
					<div class="sale-flash">- 18%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>6.890.000₫</p>
					<del>7.800.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Quạt phun sương kangaroo KG56S (KG586S)</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/237.jpg?v=1462865218000">
					</div>
					<div class="sale-flash">- 19%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>6.580.000₫</p>
					<del>10.750.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
		<div>
				<div class="product-title">
					<h4>Tủ mát kháng khuẩn Kangaroo KG298AT</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/2-f5f33efc-37e3-49a5-acd9-9713041603bf-jpg.png?v=1531210399000">
					</div>
					<div class="sale-flash">- 20%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>8.290.000₫</p>
					<del>11.500.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Bình nước nóng công nghệ kháng khuẩn Kangaroo KG818</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/may-loc-nuoc-kg-10a3-ce8895fd-49da-4110-9c04-8a7e89a56d41.jpg?v=1558353427000">
					</div>
					<div class="sale-flash">- 38%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>6.320.000₫</p>
					<del>10.200.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Bình nước nóng Kangaroo KG68IOT</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/816-27d21174-a849-4085-8b15-b82ab6ee3f92.jpg?v=1475295763693">
					</div>
					<div class="sale-flash">- 14%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>6.500.000₫</p>
					<del>8.500.000₫</del>
				</div>
			</div>
		</div>
		<div class="col-4 product-border">
			<div>
				<div class="product-title">
					<h4>Vòi nước nóng trực tiếp Kangaroo KG237</h4>
				</div>
				<div class="product-image">
					<div>
						<img alt="Máy lọc nước Kangaroo Hydrogen KG100HC vỏ tủ VTU" src="//bizweb.dktcdn.net/thumb/compact/100/075/453/products/50f11.jpg?v=1490584404000">
					</div>
					<div class="sale-flash">- 16%</div>
					<!-- <div>
						<button type="button" class="btn btn-success"><i class="fa fa-cart-plus"></i> Thêm vào giỏ</button>
					</div> -->
				</div>
				<div class="product-price">
					<p>7.200.000₫</p>
					<del>10.500.000₫</del>
				</div>
			</div>
		</div>
	</div>
</body>
</html>