package it.unibs.pajc.garage;

public class Van extends Vehicle{
	private int porte;
	private int capacita;
	
	@Override
	public String toString() {
		return "V";
	}
	
	public void setPorte(int p) {
		this.porte = p;
	}
	
	public void setCapacita(int c) {
		this.capacita = c;
	}
	
	public Van(int porte, int capacita, int ruote, String marca, int anno, int cilindrata, String alimentazione) {
		super(ruote, marca, anno, cilindrata, alimentazione);
		this.setPorte(porte);
		this.setCapacita(capacita);
	}

}
