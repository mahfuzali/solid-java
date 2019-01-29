package bad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Admin {

	List<User> users = new ArrayList<User>();
	
	public void addAUser(User user) {
		if(!users.contains(user)) {
			users.add(user);

			BufferedWriter out;
			try {
				out = new BufferedWriter(new FileWriter("BadSRP", true));
			    out.write(user.toString());
			    out.newLine();
			    out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		    
		} else {
			System.out.println("User already exists!");
		}
	}
}
