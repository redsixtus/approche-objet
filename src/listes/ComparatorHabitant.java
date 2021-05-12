package listes;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	

	

	@Override
	public int compare(Ville o1, Ville o2) {
		if(o1.getNbhab()>o2.getNbhab()) {
			return 1;
		}
		if(o1.getNbhab()<o2.getNbhab()) {
			return -1;
		}
		return 0;
	}

}
