package fr.diginamic.interfaces;

public class Cercle implements ObjetGeometrique {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double surface() {

		double surface = Math.PI * (rayon * 2);

		return surface;

	}

	@Override
	public double perimetre() {
		double perimetre = rayon * 2;
		perimetre = perimetre * Math.PI;

		return perimetre;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}
	

}
