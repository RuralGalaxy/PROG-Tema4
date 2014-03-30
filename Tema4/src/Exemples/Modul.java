package Exemples;

public class Modul {
	private String nom;
	private int horesSetmanals;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHoresSetmanals() {
		return horesSetmanals;
	}

	public void setHoresSetmanals(int horesSetmanals) {
		this.horesSetmanals = horesSetmanals;
	}

	public Modul(String nom, int horesSetmanals) {
		super();
		this.nom = nom;
		this.horesSetmanals = horesSetmanals;
	}

	@Override
	public String toString() {
		return "Modul [nom = " + nom + ", horesSetmanals = " + horesSetmanals + "]";
	}

}
