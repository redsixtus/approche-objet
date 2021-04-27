package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale a =new AdressePostale();
		a.nbRue = 40;
		a.codePostal= 44300;
		a.libelle="boulevard Jules Verne";
		a.ville="Nantes";
		
		Personne personne1 = new Personne();
		personne1.lastname = "cousin";
		personne1.firstname = "dimitri";
		personne1.adressepostale = a;
		
		Personne personne2 = new Personne();
		personne2.lastname = "gigi";
		personne2.firstname ="papi";
		personne2.adressepostale =new AdressePostale();
		personne2.adressepostale.codePostal= 9500;
		personne2.adressepostale.libelle="rue de paris";
		personne2.adressepostale.ville="paris";

	}

}
