package entites;

public class Cercle {
		private double rayon;

		public Cercle(double rayon) {
			super();
			this.rayon = rayon;
		}
		
		public double perimetre() {
			double perimetre=rayon*2;
			perimetre = perimetre*Math.PI;
			return perimetre;
			
		}
		public double surface() {
			double surface = Math.PI*(rayon*2);
			return surface;
		}
		

		public double getRayon() {
			return rayon;
		}

		public void setRayon(double rayon) {
			this.rayon = rayon;
		}

		@Override
		public String toString() {
			return "Cercle [rayon=" + rayon + "]";
		}

		
	
	
}
