package maps;

public class Pays {
	private String nom;
	private int nbHabi;
	private String continent;
	
	public Pays(String nom, int nbHabi, String continent) {
		super();
		this.nom = nom;
		this.nbHabi = nbHabi;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabi() {
		return nbHabi;
	}

	public void setNbHabi(int nbHabi) {
		this.nbHabi = nbHabi;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabi=" + nbHabi + ", continent=" + continent + "]";
	}
	
}
