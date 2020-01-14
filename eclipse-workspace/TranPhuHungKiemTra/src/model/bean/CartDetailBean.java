package model.bean;

public class CartDetailBean {
	private int IDCartDetail;
	private int IDBook;
	private int QuantityBuy;
	private int IDCart;
	
	public CartDetailBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CartDetailBean(int iDCartDetail, int iDBook, int quantityBuy, int iDCart) {
		super();
		IDCartDetail = iDCartDetail;
		IDBook = iDBook;
		QuantityBuy = quantityBuy;
		IDCart = iDCart;
	}
	
	public int getIDCartDetail() {
		return IDCartDetail;
	}
	
	public void setIDCartDetail(int iDCartDetail) {
		IDCartDetail = iDCartDetail;
	}
	
	public int getIDBook() {
		return IDBook;
	}
	
	public void setIDBook(int iDBook) {
		IDBook = iDBook;
	}
	
	public int getQuantityBuy() {
		return QuantityBuy;
	}
	
	public void setQuantityBuy(int quantityBuy) {
		QuantityBuy = quantityBuy;
	}
	
	public int getIDCart() {
		return IDCart;
	}
	
	public void setIDCart(int iDCart) {
		IDCart = iDCart;
	}
}
