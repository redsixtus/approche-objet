package entites;

public class Theatre {
String lastname;
int capmax=200;
int totalIncrits;
double totalrecette;


public void incrire(int persoInsc ,double prix){

	if (capmax > totalIncrits) {
		 totalIncrits = totalIncrits + persoInsc;
		 totalrecette = totalrecette + (persoInsc * prix);
		 System.out.println(totalIncrits);
		 System.out.println(totalrecette);
	}
	else{
		System.out.println("On est complete !!!!");
	}
	
 }

}
