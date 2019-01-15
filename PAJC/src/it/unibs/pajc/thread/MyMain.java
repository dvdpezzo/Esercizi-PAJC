package it.unibs.pajc.thread;

public class MyMain {
	
	public static void main(String args[]) {
		MyOperation myOp = new MyOperation();
		
		Thread thread01 = new Thread(new MyTask1(myOp), "Thread somma");
		Thread thread02 = new Thread(new MyTask2(myOp), "Thread differenza");
		
		thread01.start();
		thread02.start();
	}
}
