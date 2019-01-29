package good;

import java.io.IOException;

public class Admin {
	
	IStorage storage;
	
	public Admin(IStorage storage) {
		this.storage = storage;
	}
	
	public void addAUser(User u) {
		try {
			storage.writeToFile(u.toString(), "DIP");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Admin a = new Admin(new FileStoage());
		User u = new User("Mahfuz", "mahfuzali", "password123");
		a.addAUser(u);
	}

}
