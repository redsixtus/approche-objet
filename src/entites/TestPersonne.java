package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale a =new AdressePostale(4,"papapa",44000,"nantes");
		
		
		AdressePostale b =new AdressePostale(8,"jjkhjk",95000,"nantes");
		
		Personne personne1 = new Personne("dimitri","cousin",a);
	
		
		
		
		Personne personne2 = new Personne("jean-heude","clavier",b);
		

		personne1.nomMaj();
		
		personne1.modifNom("Markhart");
		System.out.println(personne1.lastname);
		
		personne1.modifPernom("Yuri");
		System.out.println(personne1.firstname);
		
		AdressePostale adresse2 = new AdressePostale(15,"rue de la paix",44000,"nantes");
		personne1.setAdresse(adresse2);
		
		String nom = personne1.getNom();
		System.out.println(nom);
		
		String prenom = personne1.getPrenom();
		System.out.println(prenom);
		
		AdressePostale adressepostale = personne1.getAdresse();
		System.out.println(adressepostale.codePostal);
	}

}
