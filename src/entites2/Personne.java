package entites2;

import entites.AdressePostale;

public class Personne {
	public String firstname;
	public String lastname;
	public AdressePostale adressepostale;
	
	public Personne(String firstname, String lastname, AdressePostale adressepostale) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.adressepostale = adressepostale;
	}
	
	public void nomMaj () {
		
		String c = firstname + " " + lastname.toUpperCase();
		
		System.out.println(c);
		
	}
	public void modifNom (String lastname) {
		this.lastname = lastname;
		
	}
	public void modifPernom (String firstname) {
		this.firstname = firstname;
		
	}
	public void setAdresse(AdressePostale paramAdresse) {
		adressepostale = paramAdresse;
	}
	
	public String getPrenom() {
		return firstname;
	}
	
	public String getNom() {
		return lastname;
	}
	
	public AdressePostale getAdresse() {
		return adressepostale;
	}
	
}
