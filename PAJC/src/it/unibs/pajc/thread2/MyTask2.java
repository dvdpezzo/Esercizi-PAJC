package it.unibs.pajc.thread2;

import java.util.Random;

public class MyTask2 implements Runnable {
	
	private Buffer buffer;
	
	public MyTask2(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i = 0; i < buffer.getBufferElements(); i++)
		{
			Random r = new Random();
			int ms = r.nextInt(5000);
			try
			{
				Thread.sleep(ms);
				buffer.read(i);
			}
			catch(Exception exec) {}
		}
	}
}
