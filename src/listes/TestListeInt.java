package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> listEntier = new ArrayList<Integer>();
		listEntier.add(-1);
		listEntier.add(5);
		listEntier.add(7);
		listEntier.add(3);
		listEntier.add(-2);
		listEntier.add(4);
		listEntier.add(8);
		listEntier.add(5);

		System.out.println(listEntier);

		System.out.println(listEntier.size());

		int chiffreMax = Collections.max(listEntier);
		System.out.println(chiffreMax);

		int chiffreMin = Collections.min(listEntier);

		for (int i = 1; i <= listEntier.size() - 1; i++) {

			if (listEntier.get(i) == chiffreMin) {
				listEntier.remove(i);

			}

		}
		System.out.println(listEntier);

		for (int i = 1; i <= listEntier.size()- 1; i++) {

			if (listEntier.get(i) <= 0) {

				listEntier.set(i, - listEntier.get(i));
			}

		}
		System.out.println(listEntier);
	}

}
