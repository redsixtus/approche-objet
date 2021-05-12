package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("printemps", 1), ETE("ete", 2), AUTOMNE("automne", 3), HIVER("hiver", 4);

	private String libelle;
	private int num;



	private Saison(String libelle, int num) {
		this.libelle = libelle;
		this.num = num;
	}
	
	public static Saison getSaison(String libelle) {
		
		Saison[]saisons=Saison.values();
		
		for(Saison saison : saisons) {
		
			if(saison.getLibelle().equals(libelle)) {
				
				return saison;
			}	
			
		}
		return null;
	}
	

	public String getLibelle() {
		return libelle;
	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
