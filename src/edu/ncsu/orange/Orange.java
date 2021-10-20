package edu.ncsu.orange;

public class Orange {
	
	private double prix;
	
	private String origine;

	public Orange(double prix, String origine) {
		if(prix < 0) {
			throw new IllegalArgumentException("Le prix ne doit pas être negatif.");
		}
		this.prix = prix;
		this.origine = origine;
	}

	public double getPrix() {
		return prix;
	}

	public String getOrigine() {
		return origine;
	}
	
	@Override
	public String toString() {
		return prix + "EUR - " + origine; 
	}
	
	@Override
	public boolean equals(Object o) {
        if (!(o instanceof Orange)) {
            return false;
        }
        Orange orange = (Orange) o;
         
       return orange.getOrigine().equals(origine) && Double.compare(orange.getPrix(), prix) == 0; 
	}
}
