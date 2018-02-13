package jtcr9.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {

	public static void read(String ... args) {
		FileInputStream fin = null;
		
		if (args.length != 1) {
			System.out.println("Invalid filename");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid file");
			return;
		}
		
		try {
			System.out.println(fin.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error reading file.");
		}
		
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error closing file.");
		}
	}
	
	public static void read2(String ... args) {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(args[0]);
			System.out.println(fin.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("I/O Error: ");
			e.printStackTrace();
		} finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void copy(String ... args) {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		if (args.length != 2) {
			System.out.println("Invalid arguements");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			int i = 0;
			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("I/O Error: ");
			e.printStackTrace();
		} finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Input file closing error: ");
				e.printStackTrace();
			}
			try {
				if (fout != null) fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Output file closing error: ");
				e.printStackTrace();
			}
		}
		
	}
}
