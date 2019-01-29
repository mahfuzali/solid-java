package good;

public class User implements IUser{
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

	public double standardSubcription(int years) {
		// TODO Auto-generated method stub
		return ONE_YEAR_SUBSCRIPTION_FEE * years;
	}

}
