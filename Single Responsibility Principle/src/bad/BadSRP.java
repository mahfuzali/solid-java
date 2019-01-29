package bad;

public class BadSRP {

	public static void main(String[] args) {
		User u = new User("John", "john", "1234");
		Admin a = new Admin();
		a.addAUser(u);
	}

}
