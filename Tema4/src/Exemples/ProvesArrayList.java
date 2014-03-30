package Exemples;
import java.util.ArrayList;

public class ProvesArrayList {

		ArrayList<Modul> llistaModuls;
	
	public void proves() {
		Modul programacio = new Modul("PRO", 7);
		Modul basededades = new Modul("BDD", 7);
		Modul sistemes = new Modul("SIN", 10);
		Modul formacio = new Modul("FOL", 5);
		llistaModuls.add(programacio);
		llistaModuls.add(basededades);
		llistaModuls.add(sistemes);
		llistaModuls.add(formacio);
		mostraLlista();
		llistaModuls.remove(2);
		mostraLlistaIndex();
		Modul nou = new Modul ("NOU", 30);
		llistaModuls.add(2, nou);
		mostraLlistaIndex();
		llistaModuls.remove(nou);
		mostraLlistaIndex();
		Modul doi = new Modul ("DOI", 10);
		llistaModuls.add(doi);
		mostraLlistaIndex();
	}
	
	public static void main(String[] args) {
		ProvesArrayList p = new ProvesArrayList();
		p.proves();
		
		
	}
	
	public void mostraLlistaIndex() {
		for (int i = 0; i < llistaModuls.size(); i++) {
			System.out.println(llistaModuls.get(i).getNom() + " "+ i);
		}
	}

	public void mostraLlista() {
		for (Modul d: llistaModuls) {
			System.out.println(d);
			}
		}
		
	public ProvesArrayList() {
		super();
		llistaModuls = new ArrayList<>();
	}
	
}
