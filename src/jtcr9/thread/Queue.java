package jtcr9.thread;

public class Queue {

	private int num;
	private boolean ready = false;
	
	synchronized int get() {
		while(!ready) 
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		
		System.out.println("Got: " + num);
		ready = false;
		notify();
		return num;
	}
	
	synchronized void put(int num) {
		while(ready)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		
		this.num = num;
		ready = true;
		System.out.println("Put: " + num);
		notify();
	}
}
