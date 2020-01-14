package model.bean;

public class OrderDetailBean {
	private int idOrderDetail;
	private int idBook;
	private int quantityBuy;
	private int idCart;
	
	public OrderDetailBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetailBean(int idOrderDetail, int idBook, int quantityBuy, int idCart) {
		super();
		this.idOrderDetail = idOrderDetail;
		this.idBook = idBook;
		this.quantityBuy = quantityBuy;
		this.idCart = idCart;
	}

	public int getIdOrderDetail() {
		return idOrderDetail;
	}

	public void setIdOrderDetail(int idOrderDetail) {
		this.idOrderDetail = idOrderDetail;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public int getQuantityBuy() {
		return quantityBuy;
	}

	public void setQuantityBuy(int quantityBuy) {
		this.quantityBuy = quantityBuy;
	}

	public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}
}
