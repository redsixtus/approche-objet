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
			//System.out.println(v);
			
		}
		// recherche dune ville
		Scanner scanner = new Scanner( System.in );
		System.out.println("taper le nom de votre Commune");
		String choix = scanner.nextLine();
		System.out.println("vous avais saisie"+" "+choix);
		
		for( int i = 0 ; i <= recensement.size() - 1; i++ ) {
			Ville villes = recensement.get(i);
			
			if( choix.equalsIgnoreCase(villes.getNomCommune())) {
				System.out.println("la pop de votre ville est "+" "+villes.getPopTotale());
			}
			
		}
		Scanner votreDepartement = new Scanner( System.in );
		System.out.println("taper le nom de votre departement");
		String departements = votreDepartement.nextLine();
		System.out.println("vous avais saisie"+" "+ departements);
		int popDepartement= 0;
		
		for(int i = 0 ; i <= recensement.size() - 1; i++ ) {
			Ville departement = recensement.get(i);
			
			if(departements.equalsIgnoreCase(departement.getCodeDept())){
				//
				popDepartement = popDepartement + departement.getPopTotale();
				 
			}
			
		}
		System.out.println("votre region à "+ popDepartement +" "+"Paysan" );
		
		
		Scanner votreRegion = new Scanner( System.in );
		System.out.println("taper le nom de votre region");
		String regions = votreRegion.nextLine();
		System.out.println("vous avais saisie"+" "+ regions);
		int popRegion= 0;
		
		for(int i = 0 ; i <= recensement.size() - 1; i++ ) {
			Ville region = recensement.get(i);
			
			if(regions.equalsIgnoreCase(region.getNomRegion())){
				//
				 popRegion = popRegion + region.getPopTotale();
				 
			}
			
		}
		System.out.println("votre region à "+ popRegion +" "+"Paysan" );
	}

}
