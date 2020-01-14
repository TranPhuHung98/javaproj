package model.bean;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class BookBean {
	private int	IDBook;
	private String	Name;
//	private int		Quantity;
	private int	Price;
	private int	IDCategory;
	private String	Image;
//	private Date	DateInput;
	private String	Author;
	
	public BookBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookBean(int iDBook, String name, int price, int iDCategory, String image, String author) {
		super();
		IDBook = iDBook;
		Name = name;
//		Quantity = quantity;
		Price = price;
		IDCategory = iDCategory;
		Image = image;
//		DateInput = dateInput;
		Author = author;
	}
	
	public int getIDBook() {
		return IDBook;
	}
	
	public void setIDBook(int iDBook) {
		IDBook = iDBook;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
//	public int getQuantity() {
//		return Quantity;
//	}
//	
//	public void setQuantity(int quantity) {
//		Quantity = quantity;
//	}
	
	public int getPrice() {
		return Price;
	}
	
	public void setPrice(int price) {
		Price = price;
	}
	
	public int getIDCategory() {
		return IDCategory;
	}
	
	public void setIDCategory(int iDCategory) {
		IDCategory = iDCategory;
	}
	public String getImage() {
		return Image;
	}
	
	public void setImage(String image) {
		Image = image;
	}
//	public Date getDateInput() {
//		return DateInput;
//	}
//	
//	public void setDateInput(Date dateInput) {
//		DateInput = dateInput;
//	}
	public String getAuthor() {
		return Author;
	}
	
	public void setAuthor(String author) {
		Author = author;
	}
	
	public String getPriceFormat() {
		return NumberFormat.getCurrencyInstance(new Locale("vn", "VN")).format(Price);
	}
}
