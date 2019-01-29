package bad;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	List<User> listOfUser = new ArrayList<User>();
	List<User> listOfPremium = new ArrayList<User>();
	List<User> listOfStudent = new ArrayList<User>();

	FileStorage fs = new FileStorage();
	
	public void addAUser(User u) {
		listOfUser.add(u);
		fs.wrtieToFile(u.toString(), "dipfile");
	}
	
	public void addAStudentUser(User u) {
		listOfStudent.add(u);
		fs.wrtieToFile(u.toString(), "dipfile");
	}
	
	public void addAPremiumUser(User u) {
		listOfPremium.add(u);
		fs.wrtieToFile(u.toString(), "dipfile");
	}
}
