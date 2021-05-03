package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
double jourTravailler= 30;
double gainJour=50;

	@Override
	public double getSalaire() {
		double gainMois =jourTravailler*gainJour;
		
		return gainMois;
	}

}
