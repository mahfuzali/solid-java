package good;

public class StudentUser implements IUser, ISubcription {

	private String name;
	private String username;
	private String password;
	
	public StudentUser(String name, String username, String password) {
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
	

	public double subscriptionPrice(int years) {
		// TODO Auto-generated method stub
		return (ONE_YEAR_SUBSCRIPTION_FEE * 0.5) * years;
	}

}
