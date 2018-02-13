package jtcr9.thread;

public class Producer implements Runnable {
	private Queue queue;
	private int max;

	public Producer(Queue queue, int max) {
		this.queue = queue;
		this.max = max;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		for(int i = 0; i < max; i++) {
			if(i == max)
				System.out.println("Reached the maximum number.");
			queue.put(i);
		}
	}

}
