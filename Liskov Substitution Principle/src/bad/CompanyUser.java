package bad;

public class CompanyUser extends User {

	public CompanyUser(String name, String username, String password) {
		super(name, username, password);
	}

	@Override
	public double subscriptionPrice(int years) {
		throw new UnsupportedOperationException("Not supported");
	}
	
}
