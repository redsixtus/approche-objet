package listes;

import java.util.ArrayList;
import java.util.Arrays;



public class TestListeString {

	
	public static void main(String[] args) {
		String selection= null;
		int max=0;
		ArrayList<String> listVille = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"));
		
		for(int i = 0; i <= listVille.size()-1; i++) {
			String nomVille =listVille.get(i);
            if(nomVille.length() > max ) {
            	max = nomVille.length();
            	selection = nomVille;
            	
            }
            
                 
        }
		System.out.println(selection);
	}

}
