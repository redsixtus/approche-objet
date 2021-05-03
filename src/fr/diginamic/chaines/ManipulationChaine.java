package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		
		System.out.println(chaine.length())
		;
		chaine.length();
		
		chaine.indexOf(';');
		System.out.println(chaine.indexOf(';'))
		;
		String nom=chaine.substring(0,chaine.indexOf(';'));
		System.out.println(chaine.substring(0,chaine.indexOf(';')));
		
		String prenom=chaine.substring(7,chaine.indexOf('2')-1);
		
		
		chaine.substring(0,chaine.indexOf(';')).toUpperCase();
		System.out.println(chaine.substring(0,chaine.indexOf(';')).toUpperCase());
		String a =chaine.substring(0,chaine.indexOf(';')).toLowerCase();
		System.out.println(a);
		
		chaine.substring(0,chaine.indexOf(';')).split(chaine);
		String [] tab = chaine.split(";");
		  for(int i=0; i < tab.length; i++){
	          System.out.println(tab[i]);
	          }
		  
		  	int indexDebutSalaire = chaine.indexOf('2');
	          int longueurChaine= chaine.length();
		  String salaire = chaine.substring(indexDebutSalaire, longueurChaine).replaceAll(" ", "");     
	          System.out.println(salaire);
	Salarie salarie1 = new Salarie(nom,prenom,Double.parseDouble(salaire));
	          System.out.println(salarie1.getFirstname()+" "+salarie1.getLastname()+" "+salarie1.getSalaire());
	          }

	

}
