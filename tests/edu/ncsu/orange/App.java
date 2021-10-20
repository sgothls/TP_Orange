package edu.ncsu.orange;
import edu.ncsu.orange.Orange;
import edu.ncsu.panier.Panier;

public class App {

	public static void main(String[] args) {
		Panier p = new Panier(10);
		p.ajoute(new Orange(0.80, "France"));
		p.ajoute(new Orange(0.80, "Espagne"));
		p.ajoute(new Orange(0.90, "Floride"));
		p.boycottOrigine("France");
		System.out.println(p.toString());
	}

}
