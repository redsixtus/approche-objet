package fr.diginamic.operations;



public class Calcul {

public static double calculOpe(double a,double b,char c) {
	
	if (c == '+') {
		return(a + b);
	}
	else if(c=='-') {
		return(a-b);
	}
	else if(c=='*') {
		return(a*b);
	}
	else if(c =='/') {
		return(a/b);
	}
 return 0.0;
}






}
