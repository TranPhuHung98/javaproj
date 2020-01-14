package model.bean;

public class CartBean {
	private int idCart;
	private int idCustomer;
	private int idBook;
	private int quantity;
	private CustomerBean customer;
	private BookBean book;
	
	public CartBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartBean(int idCart, int idCustomer, int idBook, int quantity) {
		super();
		this.idCart = idCart;
		this.idCustomer = idCustomer;
		this.idBook = idBook;
		this.quantity = quantity;
	}

	public CartBean(int idCart, int idCustomer, int idBook, int quantity, CustomerBean customer,
			BookBean book) {
		super();
		this.idCart = idCart;
		this.idCustomer = idCustomer;
		this.idBook = idBook;
		this.quantity = quantity;
		this.customer = customer;
		this.book = book;
	}

	public int getIdCart() {
		return idCart;
	}

	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CustomerBean getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBean customer) {
		this.customer = customer;
	}

	public BookBean getBook() {
		return book;
	}

	public void setBook(BookBean book) {
		this.book = book;
	}
}
