package sCalculatorTools.AreasCalculator.abstractclasses;

public class TriangleA extends Shape{

	public TriangleA(double height, double width) {
		super(height, width);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateArea(double width, double height) {
		// TODO Auto-generated method stub
		return (width * height) / 2;
	}

}
