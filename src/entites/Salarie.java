package entites;

public class Salarie {
private String lastname;
private String firstname;
private double salaire;

public Salarie(String lastname, String firstname, double salaire) {
	super();
	this.lastname = lastname;
	this.firstname = firstname;
	this.salaire = salaire;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public double getSalaire() {
	return salaire;
}

public void setSalaire(double salaire) {
	this.salaire = salaire;
}

}
