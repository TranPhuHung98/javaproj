package model.bean;

public class UserBean {
	private int IdUser;
	private String	UserName;
	private String	Password;
	private boolean	Permission;
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserBean(int idUser,String userName, String password, boolean permission) {
		super();
		IdUser = idUser;
		UserName = userName;
		Password = password;
		Permission = permission;
	}
	
	
	public int getIdUser() {
		return IdUser;
	}

	public String getUserName() {
		return UserName;
	}
	
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public boolean isPermission() {
		return Permission;
	}
	
	public void setPermission(boolean permission) {
		Permission = permission;
	}
}
