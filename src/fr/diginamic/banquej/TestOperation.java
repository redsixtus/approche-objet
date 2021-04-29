package fr.diginamic.banquej;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
private static double somme;

public static void main(String[] args) {
		
		
		Credit credit1 = new Credit("2021/02/13",15000.50);
		Debit debit1 = new Debit("2021/05/20",20003);
		Credit credit2 = new Credit("2010/10/25",150000.50);
		Debit debit2 = new Debit("2021/03/10",20023);
		
		Operation[] array={credit1,debit1,credit2,debit2};
		
		for ( int i=0; i<array.length; i++) {
			if (array[i].getType().equals("CREDIT")) {
                somme -= array[i].getMontant();
            }
            else {
                somme += array[i].getMontant();
            }	
			System.out.println("Le solde de votre compte est de :"+somme); 
	}
	}
}
