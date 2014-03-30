package Exemples;

public class Cicle {
	private String nom;
	private int nombreAlumnes;

	public Cicle(String nom, int nombreAlumnes) {
		super();
		this.nom = nom;
		this.nombreAlumnes = nombreAlumnes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreAlumnes() {
		return nombreAlumnes;
	}

	public void setNombreAlumnes(int nombreAlumnes) {
		this.nombreAlumnes = nombreAlumnes;
	}

	@Override
	public String toString() {
		return "Cicle [nom = " + nom + ", nombreAlumnes = " + nombreAlumnes + "]";
	}

}