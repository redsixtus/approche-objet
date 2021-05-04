package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		Iterator<Integer> iterKey = mapVilles.keySet().iterator();

		while (iterKey.hasNext()) {
			Integer ville = iterKey.next();
			System.out.println(ville);
		}
		
		Iterator<String> iterValeur = mapVilles.values().iterator();
		
		while (iterValeur.hasNext()) {
		String villes = iterValeur.next();
		System.out.println(villes);
		}
		System.out.println(mapVilles.size());
	}
}
