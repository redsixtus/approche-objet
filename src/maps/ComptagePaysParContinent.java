package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> payss= new ArrayList<>();
		payss.add(new Pays("France", 65,"Europe" ));
		payss.add(new Pays("Allemagne", 80,"Europe"));
		payss.add(new Pays("Belgique", 10000000,"Europe"));
		payss.add(new Pays("Russie", 150000000,"Asie"));
		payss.add(new Pays("Chine", 1400000000,"Asie"));
		payss.add(new Pays("Indonésie", 220000000,"Océanie"));
		payss.add(new Pays("Australie", 20000000,"Océanie"));
		
		
		HashMap<String,Integer> mapPays = new HashMap<>(); 
		
		
	}

}
