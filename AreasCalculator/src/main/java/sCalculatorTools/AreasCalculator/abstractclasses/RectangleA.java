package sCalculatorTools.AreasCalculator.abstractclasses;

public class RectangleA extends Shape {

	public RectangleA(double height, double width) {
		super(height, width);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea(double width, double height) {
		return width * height;
	}

}
