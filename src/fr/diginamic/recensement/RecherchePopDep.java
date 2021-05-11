package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopDep {
	
	public void popDep(ArrayList<Ville> recensement) {
	Scanner votreDepartement = new Scanner(System.in);
	System.out.println("taper le nom de votre departement");
	String departements = votreDepartement.nextLine();
	System.out.println("vous avais saisie" + " " + departements);
	int popDepartement = 0;

	for (int i1 = 0; i1 <= recensement.size() - 1; i1++) {
		Ville departement = recensement.get(i1);

		if (departements.equalsIgnoreCase(departement.getCodeDept())) {
			//
			popDepartement = popDepartement + departement.getPopTotale();

		}

	}
	System.out.println("votre region à " + popDepartement + " " + "Paysan");
	}
}
