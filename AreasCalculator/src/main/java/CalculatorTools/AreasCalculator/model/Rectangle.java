package CalculatorTools.AreasCalculator.model;

import CalculatorTools.AreasCalculator.interfaces.IShape;

public class Rectangle implements IShape{
	
	private double height;
	private double width;
	
	
	

	public Rectangle(double height, double width) {
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

	@Override
	public double calculateArea(double width, double height) {
		
		return width * height;
	}

}
