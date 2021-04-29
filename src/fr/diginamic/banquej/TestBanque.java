package fr.diginamic.banquej;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		
		Compte compte1 = new Compte("2000","150");
		CompteTaux compte2 = new CompteTaux("2001","20003",0.15);
		
		
		Compte[] array={compte1,compte2};
		
		for ( int i=0; i<array.length; i++) {
	           
            System.out.println( array[ i ]);	
            
	}
	}
}
