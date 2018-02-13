package jtcr9.thread;

public class Callee {

	synchronized void call(String msg) {
		System.out.print(msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(", ");
	}
	
	void callAgain(String msg) {
		System.out.print(msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(", ");
	}
}
