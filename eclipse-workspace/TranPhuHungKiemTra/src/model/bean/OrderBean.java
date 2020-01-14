package model.bean;

import java.sql.Date;

public class OrderBean {
	private int	IdOrders;
	private int	IdCustomer;
	private Date DateBuy;
	private Boolean haveBuy;
	public OrderBean(int idOrders, int idCustomer, Date dateBuy, Boolean haveBuy) {
		super();
		IdOrders = idOrders;
		IdCustomer = idCustomer;
		DateBuy = dateBuy;
		this.haveBuy = haveBuy;
	}
	public int getIdOrders() {
		return IdOrders;
	}
	public void setIdOrders(int idOrders) {
		IdOrders = idOrders;
	}
	public int getIdCustomer() {
		return IdCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		IdCustomer = idCustomer;
	}
	public Date getDateBuy() {
		return DateBuy;
	}
	public void setDateBuy(Date dateBuy) {
		DateBuy = dateBuy;
	}
	public Boolean getHaveBuy() {
		return haveBuy;
	}
	public void setHaveBuy(Boolean haveBuy) {
		this.haveBuy = haveBuy;
	}
}
