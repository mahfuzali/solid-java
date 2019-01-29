package good;

import java.io.IOException;

public interface IStorage {
	void writeToFile(String data, String path) throws IOException;
}
