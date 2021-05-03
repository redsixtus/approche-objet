package fr.diginamic.salaire;

public abstract class Intervenant {
String nom;
String premon;


public abstract double getSalaire();

public static void afficherDonnees(Intervenant intervenant) {
	System.out.println(intervenant.nom+" "+intervenant.premon+" "+intervenant.getSalaire()+" "+intervenant.getClass().getSimpleName());
}
public void stockNomPrenom(String nom, String prenom) {
	this.nom=nom;
	this.premon=prenom;
}

}
