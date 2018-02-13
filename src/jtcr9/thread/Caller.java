package jtcr9.thread;

public class Caller implements Runnable {

	private String msg;
	private Callee callee;
	Thread thread;
	
	public Caller(Callee callee, String msg) {
		super();
		this.msg = msg;
		this.callee = callee;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		callee.call(msg);
		
		synchronized (callee) {
			callee.callAgain(msg);
		}
	}

}
