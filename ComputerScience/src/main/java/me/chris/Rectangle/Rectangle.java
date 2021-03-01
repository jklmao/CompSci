package me.chris.Rectangle;

public class Rectangle {

	double width;
	double height;

	Rectangle() {
		width = 1;
		height = 1;
	}

	public void setWidth(double width) {

		this.width = width;
	}

	public void setHeight(double height) {

		this.height = height;
	}

	public double getWidth() {

		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {

		return width * height;

	}

	public double getPerimeter() {

		return 2 * width + 2 * height;
	}

	public void rectangleInfo() {

		System.out.println("Width: " + getWidth());
		System.out.println("Height: " + getHeight());
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());

	}

}
