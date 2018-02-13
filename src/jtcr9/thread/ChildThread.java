package jtcr9.thread;

public class ChildThread extends Thread {
	
	public ChildThread(String name) {
		super(name);
		System.out.println(this);
		this.start();
	}

	@Override
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(this.getName() + ": " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(this.getName() + " interrupted: " + e.getMessage());
		}
		System.out.println("Exsiting " + this.getName() + ".");
	}

}
