package listes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class TestVille {

	public static void main(String[] args) {
		ArrayList<Ville> villes= new ArrayList<>();
		villes.add(new Ville("Nice", 343000 ));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		int max=0;
		int habgrand=0;
		for(int i = 0; i <= villes.size()-1; i++) {
			
            villes.get(i);
            
            if(villes.get(i).getNbhab()> max) {
            	max = villes.get(i).getNbhab();
            	habgrand = i;
            }
            
                 
		}
		System.out.println(villes.get(habgrand));
		
		int min=max;
		int habmin=0;
		for(int i = 0; i <= villes.size()-1; i++) {
			
			if(villes.get(i).getNbhab()<min) {
			min = villes.get(i).getNbhab();
			habmin = i;
			}
		}
		System.out.println(villes.get(habmin));
		villes.remove(habmin);
		System.out.println(villes);
		
		
		Ville vil;
		for(int i = 0; i <= villes.size()-1; i++) {
			
			if(villes.get(i).getNbhab()>100000) {
			vil = villes.set(i,new Ville(villes.get(i).getVille().toUpperCase(),villes.get(i).getNbhab()));
			
			System.out.println(vil);
					
			Iterator<Ville> iterator = villes.iterator();
			while (iterator.hasNext()) {
				Ville myVille = iterator.next();
				if(myVille.getVille().equals("Marseille")) {
					System.out.println("voiture");
					
				}
			}
			}
		}
	}

}
