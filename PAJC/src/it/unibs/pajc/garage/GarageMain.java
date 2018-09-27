package it.unibs.pajc.garage;

import java.util.*;
import it.unibs.fp.mylib.*;

//Still need to implement "Show vehicle details..."

public class GarageMain {
	private static int nPlaces = 15;

	public static void main(String[] args) {
		ArrayList<Vehicle> garage = new ArrayList<>();
		String[] menu = new String[] {"Visualizza stato Garage", "Aggiungi un veicolo", "Rimuovi un veicolo"};
		MyMenu garagemenu = new MyMenu("Effettua una scelta", menu);
		boolean exit = false;
		while(exit!=true) {
		int choice = garagemenu.scegli();
		switch(choice) {
		case 1:
			printGarage(garage);
			break;
		case 2:
			addVehicle(garage);
			break;
		case 3:
			removeVehicle(garage);
			break;
		case 0:
			exit = true;
			break;		
		}
		}
	}
	
	public static void addVehicle(ArrayList<Vehicle> g){
		if(g.size()>15) {
			System.out.println("Il garage è pieno");
			return;
		}
		String[] menu = new String[] {"Macchina", "Moto", "Furgone"};
		MyMenu vehiclemenu = new MyMenu("Che veicolo vuoi aggiungere?", menu);
		int choice = vehiclemenu.scegli();
		int ruote = InputDati.leggiIntero("Ruote:");
		String marca=InputDati.leggiStringaNonVuota("Marca:");
		int anno = InputDati.leggiIntero("Anno:");
		int cilindrata = InputDati.leggiIntero("Cilindrata:");
		String alimentazione = InputDati.leggiStringaNonVuota("Alimentazione:");
		switch(choice) {
		case 1:
			int porte = InputDati.leggiIntero("Porte:");
			Car c = new Car(porte, ruote, marca, anno, cilindrata, alimentazione);
			g.add(c);
			break;
		case 2:
			int tempi = InputDati.leggiIntero("Tempi:");
			Moto m = new Moto(tempi, ruote, marca, anno, cilindrata, alimentazione);
			g.add(m);
			break;
		case 3:
			int p = InputDati.leggiIntero("Porte:");
			int capacita = InputDati.leggiIntero("Capacita:");
			Van v = new Van(p, capacita, ruote, marca, anno, cilindrata, alimentazione);
			g.add(v);
			break;
		}
	}
	
	public static void removeVehicle(ArrayList<Vehicle> g) {
		int toRem = InputDati.leggiIntero("Quale posto vuoi rimuovere?");
		g.remove(toRem);
	}
	
	public static void printGarage(ArrayList<Vehicle> g) {
		for(int i=0; i<g.size(); i++) {
			System.out.print((i+1)+".["+g.get(i).toString()+"]\n");
		}
	}
	

}
