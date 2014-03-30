package Exemples;

public class Institut {

	public static void main(String[] args) {
		Modul programacio;
		programacio = new Modul("Programacio", 7);
		System.out.println(programacio.getNom());
		System.out.println(programacio);
		System.out.println();

		Modul basededades;
		basededades = new Modul("Basededades", 20);
		System.out.println(basededades.getNom());
		System.out.println(basededades);
		System.out.println();

		Cicle S1W;
		S1W = new Cicle("S1W", 300);
		System.out.println(S1W.getNom());
		System.out.println(S1W);
		System.out.println();

		CicleArray CicleObj;
		CicleObj = new CicleArray("Desenvolupament", 300, 5);
		CicleObj.afegirModul(programacio);
		CicleObj.afegirModul(basededades);
		System.out.println(CicleObj.tornaModul("basededades"));
		System.out.println(CicleObj.numeroModuls);
		CicleObj.esborrarModul("basededades");
	
	}

	@Override
	public String toString() {
		return "Institut [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
