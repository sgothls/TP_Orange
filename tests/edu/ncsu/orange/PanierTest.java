package edu.ncsu.orange;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.panier.Panier;

public class PanierTest {

	@Test
	public void test() {

		Orange o1 = new Orange(0.8, "France");
		Orange o2 = new Orange(0.80, "Espagne");
		Orange o3 = new Orange(0.90, "Floride");
		Orange o4 = new Orange(0.8, "France");
		
		Panier p1 = new Panier(4);
		p1.ajoute(o1);
		p1.ajoute(o2);
		p1.ajoute(o3);
		p1.ajoute(o4);
		
		Panier p2 = new Panier(4);
		p2.ajoute(o1);
		p2.ajoute(o2);
		p2.ajoute(o3);
		p2.ajoute(o4);
		
		assertEquals(p1, p2);
		
		Panier p3 = new Panier(3);
		p3.ajoute(o1);
		p3.ajoute(o2);
		p3.ajoute(o3);
		
		assertNotEquals(p1, p3);
	}

}
