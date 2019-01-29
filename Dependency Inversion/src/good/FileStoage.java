package good;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileStoage implements IStorage {

	@Override
	public void writeToFile(String data, String path) throws IOException {
	    BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
	    out.write(data);
	    out.newLine();;
	    out.close();
			
	}

}
