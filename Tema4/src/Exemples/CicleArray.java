package Exemples;

public class CicleArray {
	private String nom;
	private int horesTotals;
	private Modul[] moduls;
	private int alumnes;
	int numeroModuls = 0;

	public int getHoresTotals() {

		return horesTotals;
	}

	public void setHoresTotals(int horesTotals) {
		this.horesTotals = horesTotals;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public CicleArray(String nom, int alumnes, int maximModuls) {
		this.nom = nom;
		this.alumnes = alumnes;
		moduls = new Modul[maximModuls];
		numeroModuls = 0;

	}

	public boolean afegirModul(Modul nou) {
		if (numeroModuls < moduls.length) {
			moduls[numeroModuls] = nou;
			numeroModuls++;
			return true;
		} else {
			return false;
		}
	}

	public Modul tornaModul(String nom) {
		for (int i = 0; i < numeroModuls; i++) {
			if (moduls[i].getNom().equalsIgnoreCase(nom)) {

				return moduls[i];
			}
		}
		return null;
	}

	// Important mirar el equals. Importar cadenes utilitzar equals
	public boolean esborrarModul(String eliminat) {
		for (int i = 0; i < numeroModuls; i++) {
			if (moduls[i].getNom().equalsIgnoreCase(eliminat)) {
				for (int j = i; j < numeroModuls; j++) {
					moduls[j] = moduls[j + 1];
					numeroModuls--;
				}
			}
		}
		return true;
	}

	public int getNumeroModuls() {
		return numeroModuls;
	}
}
