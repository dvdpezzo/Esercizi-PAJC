package it.unibs.pajc.thread2;

public class Buffer {

	public int [] data; // dato condiviso
	public int nr_elem = 10; // max numero di elementi di default
	public boolean empty = true; // stato buffer all'inizio
	
	public Buffer(int elem) { // inizializzo il buffer
		if(elem != -1)
		{
			data = new int[elem];
			nr_elem = elem;
		}
		else
		{
			data = new int[nr_elem];
		}
	}
	
	public synchronized void write(int value) throws InterruptedException {
		while(!empty)
		{
			System.out.println(Thread.currentThread().getName() + " attende che il lettore legga il dato");
			wait(); // sospende l'esecuzione e rilascia il monitor
		}
		
		data[value] = value; // scrivo il dato
		empty = false; // aggiorno lo stato
		
		System.out.println(Thread.currentThread().getName() + " ha scritto all'indice " + value + " il valore: " + data[value]);
		
		notifyAll(); // notifica della possibilità di riacquisizione del monitor
	}
	
	public synchronized int read(int value) throws InterruptedException {
		while(empty)
		{
			System.out.println(Thread.currentThread().getName() + " attende che lo scrittore scriva il dato");
			wait(); // sospende l'esecuzione e rilascia il monitor
		}
		
		empty = true; // aggiorno lo stato
		System.out.println(Thread.currentThread().getName() + " ha letto all'indice " + value + " il valore: "+ data[value]);
		
		notifyAll(); // notifica della possibilità di riacquisizione del monitor
		return data[value];
	}
	
	public int getBufferElements() {
		return nr_elem;
	}
}
