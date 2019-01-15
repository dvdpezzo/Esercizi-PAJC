package it.unibs.pajc.thread;

import java.util.Random;

public class MyOperation {

	private int data;
	
	public void doOperation(int value) {
		for(int i = 0; i < 5; i++)
		{
			try {
				Thread.sleep(new Random().nextInt(6000));
				data += value;
				System.out.println("Il valore del dato dal thread " + Thread.currentThread().getName() + " e' di " + getRes());
			} catch (Exception e) {}
		}
	}
	
	public int getRes() {
		return data;
	}
}
