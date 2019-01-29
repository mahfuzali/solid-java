package good;


public class StudentUser extends User {

	public StudentUser(String name, String username, String password) {
		super(name, username, password);
	}

	@Override
	public double subscriptionPrice(int years) {
		return super.subscriptionPrice(years) * 0.5;
	}

}
