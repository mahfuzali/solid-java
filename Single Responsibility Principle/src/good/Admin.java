package good;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	List<User> listOfUser = new ArrayList<User>();
	FileStorage fs = new FileStorage();

	public void addAUser(User user) {
		if(!listOfUser.contains(user)) {
			listOfUser.add(user);
			
			fs.wrtieToFile(user);
		    
		} else {
			System.out.println("User already exists!");
		}
	}
	
}
