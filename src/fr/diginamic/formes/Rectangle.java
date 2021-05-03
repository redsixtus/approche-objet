package fr.diginamic.formes;

public class Rectangle extends Forme {
	
double longueur;
double largeur;
	@Override
	public double calculerSurface() {
		double surface = largeur*longueur; 
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		double perimetre= (largeur*2)+(longueur*2);
		return perimetre;
	}

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}
 
}
