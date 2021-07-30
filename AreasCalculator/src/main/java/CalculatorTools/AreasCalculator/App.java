package CalculatorTools.AreasCalculator;

import java.util.Scanner;

import CalculatorTools.AreasCalculator.interfaces.IShape;
import CalculatorTools.AreasCalculator.model.Rectangle;
import CalculatorTools.AreasCalculator.model.Triangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	IShape shape = null;
        System.out.println( "¿A qué figura le quiere calcular el area?" );
        int option = sc.nextInt();
        
        System.out.println( "Alto" );
        double length = sc.nextInt();
        System.out.println( "Ancho" );
        double width = sc.nextInt();
        //Rectangle 1, Triangle 2
        if (option == 1) {
			shape = new Rectangle(length, width);
		}
        else if (option == 2) {
			shape = new Triangle(length, width);
		}
        
        System.out.println("El área es: "+ shape.calculateArea(width, length));
        
        
        
    }
}
