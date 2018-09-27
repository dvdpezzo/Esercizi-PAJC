package it.unibs.pajc.garage;

public class Moto extends Vehicle{
	int tempi;
	
	@Override
	public String toString() {
		return "M";
	}
	
	public void setTempi(int t) {
		this.tempi = t;
	}
	
	public Moto(int tempi, int ruote, String marca, int anno, int cilindrata, String alimentazione) {
		super(ruote, marca, anno, cilindrata, alimentazione);
		this.setTempi(tempi);	
	}
}
