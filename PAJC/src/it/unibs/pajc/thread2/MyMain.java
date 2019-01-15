package it.unibs.pajc.thread2;

public class MyMain {

	public static void main(String args[]) {
		Buffer buffer = new Buffer(-1);
		
		Thread thread01 = new Thread(new MyTask1(buffer), "Scrittore");
		Thread thread02 = new Thread(new MyTask2(buffer), "Lettore");
		
		thread01.start();
		thread02.start();
	}
}
