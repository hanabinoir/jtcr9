package jtcr9.thread;

public class ChildThreadRunable implements Runnable {
	
	private Thread thread;
	
	public ChildThreadRunable(String name) {
		this.thread = new Thread(this, name);
		System.out.println(this);
		this.thread.start();
	}

	@Override
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(this.thread.getName() + ": " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(this.thread.getName() + " interrupted: " + e.getMessage());
		}
		System.out.println("Exsiting " + this.thread.getName() + ".");
	}
	
	public Thread getThread() {
		return this.thread;
	}

}
