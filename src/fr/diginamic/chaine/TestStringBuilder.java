package fr.diginamic.chaine;

public class TestStringBuilder {

	public static void main(String[] args) {
		long debut = System.currentTimeMillis();

		StringBuilder builder = new StringBuilder();

		for (int a = 1; a <= 100000; a++) {

			builder.append(a);

		}

		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

		long fin1 = System.currentTimeMillis();
		String chaine = " ";
		for (int a = 1; a <= 100000; a++) {

			chaine = chaine + a;

		}

		long fin11 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin11 - fin1));

	}

}
