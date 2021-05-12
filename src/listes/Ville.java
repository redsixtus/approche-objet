package listes;

public class Ville implements  Comparable<Ville> {
	private String nom;
	private int nbhab;

	public Ville(String nom, int nbhab) {
		super();
		this.nom = nom;
		this.nbhab = nbhab;
	}
	
	


	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;

		}
		Ville other = (Ville) object;
		return nom.equals(other.getNom());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbhab() {
		return nbhab;
	}

	public void setNbhab(int nbhab) {
		this.nbhab = nbhab;
	}

	@Override
	public String toString() {
		return "Ville [ville=" + nom + ", nbhab=" + nbhab + "]";
	}




	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
