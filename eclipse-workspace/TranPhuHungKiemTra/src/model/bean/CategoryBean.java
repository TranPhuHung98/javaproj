package model.bean;

public class CategoryBean {
	private int	IDCategory;
	private String	Name;
	
	public CategoryBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CategoryBean(int iDCategory, String name) {
		super();
		IDCategory = iDCategory;
		Name = name;
	}
	
	public int getIDCategory() {
		return IDCategory;
	}
	
	public void setIDCategory(int iDCategory) {
		IDCategory = iDCategory;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
}
