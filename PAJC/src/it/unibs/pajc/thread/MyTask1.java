package it.unibs.pajc.thread;

public class MyTask1 implements Runnable {

	private MyOperation myOp;
	
	public MyTask1(MyOperation myOp) {
		this.myOp = myOp;
	}
	
	public void run() {
		myOp.doOperation(10);
	}
}
