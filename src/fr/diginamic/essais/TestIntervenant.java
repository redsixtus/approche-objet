package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie salarie1 = new Salarie();
		
		Pigiste pigiste1 = new Pigiste();
		
		salarie1.getSalaire();
		pigiste1.getSalaire();
		System.out.println(salarie1.getSalaire());
		System.out.println(pigiste1.getSalaire());
		salarie1.stockNomPrenom("Remi", "durif");
		pigiste1.stockNomPrenom("Mario", "Mario");
		
		Intervenant.afficherDonnees(pigiste1);
		Intervenant.afficherDonnees(salarie1);
	}

}
