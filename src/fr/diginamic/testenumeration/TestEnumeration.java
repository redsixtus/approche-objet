package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		
		Saison[]saisons=Saison.values();
		
		for(Saison saison:saisons) {
			System.out.println(saison.getLibelle());
		}
		Saison s1 = Saison.ETE;
		Saison s2 = Saison.AUTOMNE;
		Saison s3 = Saison.HIVER;
		Saison s4 = Saison.PRINTEMPS;
		Saison s5 = Saison.valueOf("ETE");
		
		System.out.println(s5.getLibelle());
		System.out.println(s1.getLibelle());
		System.out.println(Saison.getSaison("hiver"));
		
				
	}

}
