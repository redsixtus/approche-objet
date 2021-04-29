package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOpe, double montant) {
		super(dateOpe, montant);
		
	}

	@Override
	public String getType() {
		
		return "DEBIT";
	}

}
