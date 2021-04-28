package entites;

public class AdressePostale {

	int nbRue;
	String libelle;
	int codePostal;
	String ville;
	
	
	
	public AdressePostale(int nbRue, String libelle, int codePostal, String ville) {
		super();
		this.nbRue = nbRue;
		this.libelle = libelle;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
