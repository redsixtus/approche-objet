package fr.diginamic.banque.entites;

public class Compte {

	private String nbcompte;
	private String soldecompte;
	
	
	public Compte(String nbcompte, String soldecompte) {
	
		this.nbcompte = nbcompte;
		this.soldecompte = soldecompte;
	}


	public String getNbcompte() {
		return nbcompte;
	}


	public void setNbcompte(String nbcompte) {
		this.nbcompte = nbcompte;
	}


	public String getSoldecompte() {
		return soldecompte;
	}


	public void setSoldecompte(String soldecompte) {
		this.soldecompte = soldecompte;
	}
	
	public String toString () {
		
		return nbcompte+" "+soldecompte;
	}
	

}
