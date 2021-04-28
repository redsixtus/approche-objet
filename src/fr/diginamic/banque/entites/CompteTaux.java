package fr.diginamic.banque.entites;

public class CompteTaux extends Compte  {
	
	private double tauxDeRemuneration;
	

	public CompteTaux(String nbcompte, String soldecompte, double tauxDeRemuneration) {
		super(nbcompte, soldecompte);
		this.tauxDeRemuneration = tauxDeRemuneration;
		
	}
	
public String toString () {
		
		return super.toString() + " "+tauxDeRemuneration;
	}


	public double getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}


	public void setTauxDeRemuneration(double tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}
	
}
