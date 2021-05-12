package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Napple", 2000000);
		Ville ville2 = new Ville("Napple", 2000000);
		
		Boolean equals = ville1.equals(ville2);
		System.out.println(ville1.equals(ville2));
		System.out.println(equals);
		
		
	}

}
