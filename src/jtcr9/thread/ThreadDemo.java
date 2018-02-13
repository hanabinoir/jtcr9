package jtcr9.thread;

public class ThreadDemo {
	
	public static void threadDemo() {
		Thread thread = Thread.currentThread();
		// Instance variable created for obtaining status
		// But not required for running a thread
		ChildThreadRunable child1 = new ChildThreadRunable("Child One");
		ChildThread child2 = new ChildThread("Child Two");
		
		//System.out.println("Current thread: " + thread);
		
		// Change the name of the thread
		thread.setName("Main Thread");
		
		System.out.println("Current thread: " + thread);
		System.out.print(child1.getThread().getName() + " is alive: "
				+ child1.getThread().isAlive() + ".\n"
				+ child2.getName() + " is alive: " + child2.isAlive() + ".\n");
		
		try {
			//for(int i = 5; i > 0; i--) {
				//System.out.println(thread.getName() + ": " + i);
				//Thread.sleep(1000);
			//}
			child1.getThread().join();
			child2.join();
		} catch (InterruptedException e) {
			System.out.println(thread.getName() + " interrupted: " + e.getMessage());
		}
		
		System.out.print(child1.getThread().getName() + " is alive: " 
				+ child1.getThread().isAlive() + ".\n"
				+ child2.getName() + " is alive: " + child2.isAlive() + ".\n");
		System.out.println(thread.getName() + " finished.");
	}
}
