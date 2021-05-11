package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopulationVille {

	public void traiter(ArrayList<Ville> recensement) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("taper le nom de votre Commune");
		String choix1 = scanner1.nextLine();
		System.out.println("vous avais saisie" + " " + choix1);

		for (int i = 0; i <= recensement.size() - 1; i++) {
			Ville villes = recensement.get(i);

			if (choix1.equalsIgnoreCase(villes.getNomCommune())) {
				System.out.println("la pop de votre ville est " + " " + villes.getPopTotale());
				
			} 
			
		}
	}
}
