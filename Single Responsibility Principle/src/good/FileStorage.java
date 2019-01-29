package good;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage {
	
	public void wrtieToFile(User user) {
	    BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter("GoodSRP", true));
		    out.write(user.toString());
		    out.newLine();;
		    out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
