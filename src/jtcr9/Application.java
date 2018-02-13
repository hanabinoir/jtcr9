package jtcr9;

// import java.io.IOException;

import jtcr9.stream.ReadFile;
// import jtcr9.stream.ReadWrite;

public class Application {

	public static void main(String[] args) {
		/*try {
			ReadWrite.readChar();
			ReadWrite.readStr();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		ReadFile.read(args);
		ReadFile.copy(args);
	}

}
