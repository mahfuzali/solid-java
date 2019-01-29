package good;

public class User {
	private String name;
	private String username;
	private String password;
	
	private static final int ONE_YEAR_SUBSCRIPTION_FEE = 75;
	
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
	
	public double subscriptionPrice(int years) {
		return ONE_YEAR_SUBSCRIPTION_FEE * years;
	}
}
