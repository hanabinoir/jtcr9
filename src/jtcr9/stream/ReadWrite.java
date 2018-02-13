package jtcr9.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadWrite {

	public static void readChar() throws IOException {
		char c;
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out, true);
		
		System.out.println("Enter characters, 'q' to quit: ");
		do {
			c = (char) br.read();
			int i = c;
			
			System.out.write(i);
			System.out.write('\n');
			pr.println(c);
		} while (c != 'q');
	}
	
	public static void readStr() throws IOException {
		String str;
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out, true);
		
		System.out.println("Enter lines of text, 'stop' to quit: ");
		do {
			str = br.readLine();
			try {
				double d = new Double(str);
				int i = (int) d;
				
				if (i == d) {
					pr.println("integer: " + i);
				} else {
					pr.println("double: " + d);
				}
			} catch (NumberFormatException e) {
				pr.println("text: " + str);
			}
		} while (!str.equals("stop"));
		pr.println((3.14e-1));
	}
}
