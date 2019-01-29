package bad;

public class StudentUser extends User {
	private static final int ONE_YEAR_SUBSCRIPTION_FEE = 75;
	
	public StudentUser(String name, String username, String password) {
		super(name, username, password);
	}
	
	@Override
	public double subscriptionPrice(int years) {
		return (ONE_YEAR_SUBSCRIPTION_FEE * 0.5) * years;
	}

}
