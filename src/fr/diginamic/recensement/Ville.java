package fr.diginamic.recensement;

public class Ville implements Comparable<Ville> {
	private String codeRegion;
	private String nomRegion;
	private String codeDept;
	private String codeCommune;
	private String nomCommune;
	private int popTotale;

	public Ville(String codeRegion, String nomRegion, String codeDept, String codeCommune, String nomCOmmune,
			int popTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCOmmune;
		this.popTotale = popTotale;

	}

//methodes
	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDept=" + codeDept
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", popTotale=" + popTotale + "]";
	}

	@Override
	public int compareTo(Ville ville1) {

		return this.getNomCommune().compareTo(ville1.getNomCommune());
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getCodeDept() {
		return codeDept;
	}

	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCOmmune() {
		return nomCommune;
	}

	public void setNomCOmmune(String nomCOmmune) {
		this.nomCommune = nomCOmmune;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

}
