package fr.diginamic.operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double op1 =Calcul.calculOpe(5.2, 5.6,'+'); 
		double op2 =Calcul.calculOpe(5.2, 5.6,'-');
		double op3 =Calcul.calculOpe(5.2, 5.6,'*');
		double op4 =Calcul.calculOpe(5.2, 5.6,'/');
		
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(op4);
	}

}
