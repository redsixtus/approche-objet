package fr.diginamic.interfaces;



public class TestObjetGeometrique {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(2.2); 
		Rectangle rect1= new Rectangle(2.3,2.5);
		ObjetGeometrique[] tab = {cercle1,rect1 };
		
		for(int i = 1; i <= tab.length; i++) {
			
			 
			
			}
		System.out.println(tab[0].perimetre()+" "+tab[0].surface());
		System.out.println(tab[1].surface()+" "+tab[1].perimetre());
	}

}
