package model.bean;

	public class Orders {
		private OrderBean order;
		private OrderDetailBean orderDetail;
		private BookBean book;
		private UserBean user;
		
		public Orders() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Orders(OrderBean order, OrderDetailBean orderDetail, BookBean book, UserBean user) {
			super();
			this.order = order;
			this.orderDetail = orderDetail;
			this.book = book;
			this.user = user;
		}

		public OrderBean getOrder() {
			return order;
		}

		public void setOrder(OrderBean order) {
			this.order = order;
		}

		public OrderDetailBean getOrderDetail() {
			return orderDetail;
		}

		public void setOrderDetail(OrderDetailBean orderDetail) {
			this.orderDetail = orderDetail;
		}

		public BookBean getBook() {
			return book;
		}

		public void setBook(BookBean book) {
			this.book = book;
		}

		public UserBean getuser() {
			return user;
		}

		public void setuser(UserBean user) {
			this.user = user;
		}
	}