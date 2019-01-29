package bad;

public class User {
	private String name;
	private String username;
	private String password;
	
	
	public User(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	
	public double subscriptionPrice(int years, String typeOfUser) {
		double yearPrice = 75;
		
		if(typeOfUser.equals("student")) {
			yearPrice = (yearPrice * 0.5) * years;
		} else if(typeOfUser.equals("premium")) {
			yearPrice = (yearPrice * 2) * years;
		} else {
			yearPrice = yearPrice * years;
		}
		
		return yearPrice;
	}

}
