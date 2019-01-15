package it.unibs.pajc.thread;

public class MyTask2 implements Runnable {

	private MyOperation myOp;
	
	public MyTask2(MyOperation myOp) {
		this.myOp = myOp;
	}
	
	public void run() {
		myOp.doOperation(-10);
	}
}