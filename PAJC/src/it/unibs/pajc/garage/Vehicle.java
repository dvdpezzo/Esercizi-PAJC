package it.unibs.pajc.garage;

public class Vehicle {
	private int ruote;
	private String marca;
	private int anno;
	private int cilindrata;
	private String alimentazione;
	
	public Vehicle(int ruote, String marca, int anno, int cilindrata, String alimentazione) {
		this.setRuote(ruote);
		this.setMarca(marca);
		this.setAnno(anno);
		this.setCilindrata(cilindrata);
		this.setAlimentazione(alimentazione);
	}
	
	
	private void setRuote(int r) {
		this.ruote = ruote;
	}
	
	private void setMarca(String m) {
		this.marca = marca;
	}
	
	private void setAnno(int anno) {
		this.anno = anno;
	}
	
	private void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	private void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

}
