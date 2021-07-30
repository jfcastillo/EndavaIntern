package sCalculatorTools.AreasCalculator.abstractclasses;

import java.util.Scanner;



public class AppAbstract {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	Shape shape = null;
        System.out.println( "¿A qué figura le quiere calcular el area?" );
        int option = sc.nextInt();
        
        System.out.println( "Alto" );
        double length = sc.nextInt();
        System.out.println( "Ancho" );
        double width = sc.nextInt();
        //Rectangle 1, Triangle 2
        if (option == 1) {
			shape = new RectangleA(length, width);
		}
        else if (option == 2) {
			shape = new TriangleA(length, width);
		}
        
        System.out.println("El área es: "+ shape.calculateArea(width, length));
	}

}
