package fr.diginamic.interfaces;

public class Rectangle implements ObjetGeometrique {
	
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		double perimetre= (largeur*2)+(longueur*2);
		return perimetre;
	}

	@Override
	public double surface() {
		double surface = largeur*longueur; 
		return surface;
		
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

}
