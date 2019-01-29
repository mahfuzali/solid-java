package extra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import bad.User;


public class FileStorage {
	
	public void wrtieToFile(String data, String path) {
	    BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter(path, true));
		    out.write(data);
		    out.newLine();;
		    out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
