package edu.ncsu.panier;

import java.util.ArrayList;
import java.util.List;

import edu.ncsu.orange.Orange;

public class Panier {
	
	private final List<Orange> oranges;
	private final int maxSizePanier;

	public Panier(int maxSize) {
		oranges = new ArrayList<Orange>();
		maxSizePanier = maxSize;
	}
	
	public boolean estPlein() {
		if(oranges.size() >=maxSizePanier) {
			return true;
		}
		return false;
	}
	
	public boolean estVide() {
		return oranges.isEmpty();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Orange orange : oranges) {
			sb.append(orange.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
	public List<Orange> getOranges() {
		return oranges;
	}

	@Override
	public boolean equals(Object o) {
		 if (!(o instanceof Panier)) {
	            return false;
	        }
	        Panier panier = (Panier) o;
	        
	        if(panier.getOranges().size() != oranges.size()) {
	        	return false;
	        }
	        
		for (Orange orange : panier.getOranges()) {
			boolean matchFound = false;
			for (Orange orangeThis : oranges) {
				if(orangeThis.equals(orange)) {
					matchFound = true;
				}
			}
			if(!matchFound) {
				return false;
			}
		}
		return true;
	}
	
	public void ajoute(Orange o) throws RuntimeException {
		if (oranges.size() < maxSizePanier) {
			oranges.add(o);
		} else {
			throw new RuntimeException("Le panier est plein.");
		}
	}
	
	public void retire() {
		oranges.remove(oranges.size()-1);
	}

	public double getTotal() {
		double resultat=0;
		for (Orange o : oranges) {
			resultat += o.getPrix();
		} 
		return resultat;
	}
	
	/*
	 * public void boycottOrigine(String origine) { for (Orange o : oranges) {
	 * if(o.getOrigine().equals(origine)) { oranges.remove(o); } } }
	 */
	
	public void boycottOrigine(String origine) {
		for (int i=0; i<oranges.size(); i++) {
			if(oranges.get(i).getOrigine().equals(origine)) {
				oranges.remove(i);
			}
		}
	}
}
