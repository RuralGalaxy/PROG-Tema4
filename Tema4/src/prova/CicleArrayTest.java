package prova;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Exemples.CicleArray;
import Exemples.Modul;


public class CicleArrayTest {
	
	public static CicleArray cicle;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cicle=new CicleArray("S1W",20, 30);
		Modul mecanica;
		mecanica = new Modul("Mecànica", 25);
		cicle.afegirModul(mecanica);
		
	}
	@Test
	public void testAfegirModul() {
		Modul electricitat;
		electricitat = new Modul("Electricitat", 15);
		cicle.afegirModul(electricitat);
		assertEquals(1, cicle.getNumeroModuls());
	}

	@Test
	public void testTornaModul() {
		Modul modul = cicle.tornaModul("Electricitat");
		String resultat = modul.getNom();
		assertEquals("Electricitat",resultat);
		
	}

	@Test
	public void testEsborrarModul() {
		boolean flag = cicle.esborrarModul("Mecànica");
		if(!flag){fail("Mòdul no esborrat");}
		
	}

}
