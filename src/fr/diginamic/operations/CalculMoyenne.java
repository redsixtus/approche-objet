package fr.diginamic.operations;

import java.util.Scanner;

public class CalculMoyenne {
	
	private double[] tab = new double[0];
	
	double somme = 0;
	
	public void ajout(double element) {
	
		
		double[] tabnew = new double[tab.length+1]; 
		
		
		 for(int i=0; i < tab.length; i++){
	          tabnew[i] = tab[i];
	        }
		
		 tabnew[tabnew.length-1]=element;
	
		 tab = tabnew;
	}
	
	public double calcule() {
		
		
		for(int i=0; i < tab.length; i++) {
			somme = somme +tab[i];
		}
		
		double totalmoyenne = somme /tab.length;
		return totalmoyenne;
	}
}
