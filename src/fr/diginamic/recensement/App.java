package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {

		String codeRegion = null;
		String nomRegion = null;
		String codeDept = null;
		String codeCommune = null;
		String nomCommune = null;
		int popTotale = 0;

		Path path = Paths.get("C:/Users/dimit/OneDrive/Bureau/bordel/projet/recensement.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

		ArrayList<Ville> recensement = new ArrayList<>();

		for (int i = 1; i <= lines.size() - 1; i++) {
			String ligne = lines.get(i);
			String[] morceau = ligne.split(";");
			String popTotal = morceau[9].trim().replaceAll(" ", "");
			int popTotales = Integer.parseInt(popTotal);

			nomRegion = morceau[1];
			codeRegion = morceau[0];
			codeDept = morceau[2];
			nomCommune = morceau[6];
			codeCommune = morceau[5];
			popTotale = popTotales;

			Ville v = new Ville(codeRegion, nomRegion, codeDept, codeCommune, nomCommune, popTotale);

			recensement.add(v);
			
			
		}

		Scanner choixMenue = new Scanner(System.in);
		System.out.println(
				"menue1: rechercher part ville; menue2: rechercher pop Departemant; menue3: recherche pop region");
		String menue = choixMenue.nextLine();

		if (menue.equalsIgnoreCase("menue1")) {
			RecherchePopulationVille recherche = new RecherchePopulationVille();
			recherche.traiter(recensement);
		}else if (menue.equalsIgnoreCase("menue2")) {
			RecherchePopDep rechercheDep = new RecherchePopDep();
			rechercheDep.popDep(recensement);
		} else if (menue.equalsIgnoreCase("menue3")) {
			RechercheReg rechercheRegPop = new RechercheReg();
			rechercheRegPop.popRegion(recensement);
		}

	}

}
