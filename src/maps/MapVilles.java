package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		Ville habmin = null;
		HashMap<String, Ville> villes = new HashMap<>();
		villes.put("Nice", new Ville("Nice", 343000));
		villes.put("Carcassonne", new Ville("Carcassonne", 47800));
		villes.put("Narbonne", new Ville("Narbonne", 53400));
		villes.put("Lyon", new Ville("Lyon", 484000));
		villes.put("Foix", new Ville("Foix", 9700));
		villes.put("Pau", new Ville("Pau", 77200));
		villes.put("Marseille", new Ville("Marseille", 850700));
		villes.put("Tarbes", new Ville("Tarbes", 40600));

		Iterator<Ville> iterValeur = villes.values().iterator();

		while (iterValeur.hasNext()) {
			Ville valeur = iterValeur.next();

			if (valeur.getNbhab() < min) {
				min = valeur.getNbhab();

				habmin = valeur;

			}

		}
		villes.remove(habmin.getVille());
		
		System.out.println(villes);
	}

}
