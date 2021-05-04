package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<String,Integer> mapSalaires = new HashMap<>();
		Integer perso1= new Integer(1750);
		Integer perso2= new Integer(1825);
		Integer perso3= new Integer(2250);
		Integer perso4= new Integer(2015);
		Integer perso5= new Integer(2418);
		
		mapSalaires.put("Paul", perso1);
		mapSalaires.put("Hicham", perso2);
		mapSalaires.put("Yu", perso3);
		mapSalaires.put("Ingrid", perso4);
		mapSalaires.put("Chantal", perso5);
		
		System.out.println(mapSalaires.size());
		
	}

}
