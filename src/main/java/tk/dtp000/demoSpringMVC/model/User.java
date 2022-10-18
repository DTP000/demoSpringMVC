package tk.dtp000.demoSpringMVC.model;

public class User {
	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String fullName) {
		super();
		this.fullName = fullName;
	}
	
	
}
