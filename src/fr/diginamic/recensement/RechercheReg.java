package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Scanner;

public class RechercheReg {

	public void popRegion(ArrayList<Ville> recensement) {
		Scanner votreRegion1 = new Scanner(System.in);
		System.out.println("taper le nom de votre region");
		String regions1 = votreRegion1.nextLine();
		System.out.println("vous avais saisie" + " " + regions1);
		int popRegion1 = 0;

		for (int i1 = 0; i1 <= recensement.size() - 1; i1++) {
			Ville region = recensement.get(i1);

			if (regions1.equalsIgnoreCase(region.getNomRegion())) {
				//
				popRegion1 = popRegion1 + region.getPopTotale();

			}

		}
		System.out.println("votre region à " + popRegion1 + " " + "Paysan");
	}
}
