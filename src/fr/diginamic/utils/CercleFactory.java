package fr.diginamic.utils;

import entites.Cercle;

public class CercleFactory {

	public static  Cercle cerclerFactory(double rayon) {

		Cercle cercle = new Cercle(rayon);

		return cercle;
	}

}
