package it.unibs.pajc.garage;

public class Car extends Vehicle{
	private int porte;
	
	@Override
	public String toString() {
		return "C";
	}
	
	public void setPorte(int p) {
		this.porte=p;
	}
	
	public Car(int porte, int ruote, String marca, int anno, int cilindrata, String alimentazione) {
		super(ruote, marca, anno, cilindrata, alimentazione);
		this.setPorte(porte);	
	}
}
