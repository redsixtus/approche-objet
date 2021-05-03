package entites2;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public void afficher(Forme forme) {
		System.out.println("votre perimetre est de "+ forme.calculerPerimetre());
		System.out.println("votre surface est de "+ forme.calculerSurface());
	}
	
}
