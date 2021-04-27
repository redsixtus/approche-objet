package entites;



public class TestAdressePostale {
	
	public static void main(String[] args) {
		
	AdressePostale a =new AdressePostale();
	a.nbRue = 40;
	a.codePostal= 44300;
	a.libelle="boulevard Jules Verne";
	a.ville="Nantes";
	
	AdressePostale b =new AdressePostale();
	b.nbRue = 14;
	b.codePostal= 13001;
	b.libelle="boulevard de la liberté";
	b.ville="Marseille";
	}	
}
