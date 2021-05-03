package fr.diginamic.banque.entites;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne calcule1 = new CalculMoyenne();
		
		calcule1.ajout(12.3);
		calcule1.ajout(1.3);
		calcule1.ajout(18.9);
		calcule1.ajout(20.9);
		calcule1.ajout(21.9);
		
		System.out.println(calcule1.calcule());
	}

}
