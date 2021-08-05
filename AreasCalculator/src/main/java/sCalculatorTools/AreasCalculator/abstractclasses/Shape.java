package sCalculatorTools.AreasCalculator.abstractclasses;

public abstract class Shape {
	private double height;
	private double width;
	
	
	

	public Shape(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}




	public double getHeight() {
		return height;
	}




	public void setHeight(double height) {
		this.height = height;
	}




	public double getWidth() {
		return width;
	}




	public void setWidth(double width) {
		this.width = width;
	}

	public abstract double calculateArea(double width, double height);

}
