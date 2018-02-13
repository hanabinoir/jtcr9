package jtcr9.thread;

public class SyncController {

	public static void sync() {
		Callee callee = new Callee();
		Caller caller1 = new Caller(callee, "X");
		Caller caller2 = new Caller(callee, "Y");
		Caller caller3 = new Caller(callee, "Z");
		
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
