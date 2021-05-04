package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> listEntier = new ArrayList<Integer>(); 	
		
		for(int i = 1; i <= 100; i++) {
			
			listEntier.add(i);
			
		}
		System.out.println(listEntier.size());
	}

}
