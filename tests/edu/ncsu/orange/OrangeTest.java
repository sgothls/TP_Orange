package edu.ncsu.orange;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.ncsu.panier.Panier;

public class OrangeTest {

	@Test
	public void test1() {
		Orange o1 = new Orange(0.8, "France");
		Orange o2 = new Orange(0.80, "Espagne");
		Orange o3 = new Orange(0.90, "Floride");
		Orange o4 = new Orange(0.8, "France");
		assertEquals(o1, o4);
		assertNotEquals(o1, o2);
		assertNotEquals(o4, o3);
	}
}
