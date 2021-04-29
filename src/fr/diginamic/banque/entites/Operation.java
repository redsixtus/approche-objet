package fr.diginamic.banque.entites;

public abstract class Operation {
	private String dateOpe;
	private double montant;
	
	
	public Operation(String dateOpe, double montant) {
		super();
		this.dateOpe = dateOpe;
		this.montant = montant;
	}
	
public String toString () {
		
		return dateOpe+" "+montant;
	}

public abstract String getType();


	public String getDateOpe() {
		return dateOpe;
	}


	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}
	

}
