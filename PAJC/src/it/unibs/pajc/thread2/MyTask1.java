package it.unibs.pajc.thread2;

import java.util.Random;

public class MyTask1 implements Runnable {
	
	private Buffer buffer;
	
	public MyTask1(Buffer buffer) {
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
				buffer.write(i);
			}
			catch(Exception exec) {}
		}
	}

}
