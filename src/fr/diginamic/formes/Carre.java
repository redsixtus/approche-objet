package fr.diginamic.formes;

public class Carre extends Rectangle {
	

	double longueur;
	
		
		public double calculerSurface() {
			double surface=longueur*longueur;
			return surface;
		}

		
		


		public double calculerPerimetre() {
		double perimetre=longueur*4;
		return perimetre;}
		
		public Carre(double longueur) {
			super(longueur, longueur);
			this.longueur = longueur;
		}





		@Override
		public String toString() {
			return "Carre [longueur=" + longueur + "]";
		}

}
