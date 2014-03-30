package Exemples;

import java.util.ArrayList;

public class Alumne {
	private ArrayList<Modul> matriculats;
	private ArrayList<Integer> notes;
	private int numExpedient;
	private String nom, llinatges;
	
	public int matricular(Modul modul){
		matriculats.add(modul);
		notes.add(matriculats.indexOf(modul), 0);
		return matriculats.indexOf(modul);
	}
	public void posarNota(int index,int nota){
		notes.set(index, nota );
	}
	
	public void mostrarModuls(){
		for(Modul d : matriculats){
			System.out.println("Està matriculat al mòdul "+d.getNom());
		}
	}
	public void mostrarNotes(){
		for(Modul d : matriculats){
			System.out.println("Mòdul " + d.getNom() + " amb nota: ");
			System.out.println(notes.get(matriculats.indexOf(d)));
		}
	}

	
	public String getNom() {
		return nom;
	}

	public String getLlinatges() {
		return llinatges;
	}
	public int getExpedient() {
		return numExpedient;
	}

	
	public Alumne(String nom, String llinatges, int nExpedient) {
		super();
		matriculats = new ArrayList<>();
		notes= new ArrayList<>();
		this.numExpedient = numExpedient;
		this.nom = nom;
		this.llinatges = llinatges;
	}
	

}
