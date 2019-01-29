package bad;

import java.util.ArrayList;
import java.util.List;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>(); 
		users.add(new StudentUser("Mahfuz", "mahfuz", "password"));
		users.add(new PremiumUser("Ali", "ali", "1234"));
		users.add(new CompanyUser("Hitachi", "hcc", "helloworld"));
		
		for(User u: users) {
			// Runtime user
			u.subscriptionPrice(2);
		}
	}

}
