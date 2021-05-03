package entites2;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle cercleperimetre = new Cercle(2.5);
		Cercle cerclesurface = new Cercle (5.6);
		
		System.out.println(cercleperimetre.perimetre());
		System.out.println(cerclesurface.surface());
		
		
		Cercle cercleNew =CercleFactory.cerclerFactory(4.2);
		System.out.println(cercleNew);
	}
	
}
