package fr.diginamic.formes;

public class Cercle extends Forme {
double rayon;
	@Override
	public double calculerSurface() {
		
		double surface = Math.PI*(rayon*2);
		
		return surface;
		
		
	}

	@Override
	public double calculerPerimetre() {
		double perimetre=rayon*2;
		perimetre = perimetre*Math.PI;
		
		return perimetre;
	}

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

}
