package bad;

public class BadOCP {
	public static void main(String[] args) {
		User u = new User("John", "john", "1234");
		Admin a = new Admin();
		a.addAUser(u, "standard");
	}
}
