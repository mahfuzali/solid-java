package good;

import java.util.ArrayList;
import java.util.List;
import extra.FileStorage;

public class Admin {
	
	List<User> listOfUser = new ArrayList<User>();
	List<User> listOfPremium = new ArrayList<User>();
	List<User> listOfStudent = new ArrayList<User>();

	FileStorage fs = new FileStorage();
	
	public void addAUser(User u) {
		listOfUser.add(u);
	}
	
	public void addAStudentUser(User u) {
		listOfStudent.add(u);
	}
	
	public void addAPremiumUser(User u) {
		listOfPremium.add(u);
	}
	
}
