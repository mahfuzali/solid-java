package good;

import java.util.ArrayList;
import java.util.List;


public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<IUser> users = new ArrayList<IUser>(); 
		users.add(new StudentUser("Mahfuz", "mahfuz", "password"));
		users.add(new PremiumUser("Ali", "ali", "1234"));
		users.add(new CompanyUser("Hitachi", "hcc", "helloworld"));
		
		for(IUser u: users) {
			// Runtime error 
			u.subscriptionPrice(2);
		}
	}

}
