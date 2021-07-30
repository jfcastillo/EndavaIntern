package CalculatorTools.AreasCalculator.model;

import CalculatorTools.AreasCalculator.interfaces.IShape;

public class Triangle implements IShape{
	
	private double length;
	private double width;
	
	
	

	public Triangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}




	public double getLength() {
		return length;
	}




	public void setLength(double length) {
		this.length = length;
	}




	public double getWidth() {
		return width;
	}




	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	public double calculateArea(double width, double height) {
		
		return (width * height) / 2;
	}

}
