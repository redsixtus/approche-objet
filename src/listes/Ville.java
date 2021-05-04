package listes;

public class Ville {
private String ville;
private int nbhab;

public Ville(String ville, int nbhab) {
	super();
	this.ville = ville;
	this.nbhab = nbhab;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public int getNbhab() {
	return nbhab;
}

public void setNbhab(int nbhab) {
	this.nbhab = nbhab;
}

@Override
public String toString() {
	return "Ville [ville=" + ville + ", nbhab=" + nbhab + "]";
}

}
