package bad;

public class User implements IUser {
	private String name;
	private String username;
	private String password;
	
	private double price = 75; 
	
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
	
	@Override
	public double standardSubcription(int years) {
		return price * years;
	}

	@Override
	public double studentSubcription(int years) {
		return (price * 0.5) *years;
	}

	@Override
	public double premiumSubcription(int years) {
		return (price * 2) *years;
	}

}
