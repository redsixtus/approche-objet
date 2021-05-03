package entites2;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle1= new Cercle(14.2);
		Rectangle rectangle1= new Rectangle(12.5,20.5);
		Carre carre1= new Carre (10);
		
		System.out.println(cercle1);
		System.out.println(rectangle1);
		System.out.println(carre1);
		rectangle1.calculerPerimetre();
		rectangle1.calculerSurface();
		cercle1.calculerPerimetre();
		cercle1.calculerSurface();
		carre1.calculerPerimetre();
		carre1.calculerSurface();
		
		System.out.println(rectangle1.calculerPerimetre()+" "+rectangle1.calculerSurface());
		System.out.println(cercle1.calculerPerimetre()+" "+cercle1.calculerSurface());
		System.out.println(carre1.calculerPerimetre()+" "+carre1.calculerSurface());
		
	}

}
