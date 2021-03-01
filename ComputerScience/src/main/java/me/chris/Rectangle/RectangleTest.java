package me.chris.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();

		rect1.setWidth(4);
		rect1.setHeight(40);

		rect2.setWidth(3.5);
		rect2.setHeight(35.9);

		rect1.rectangleInfo();

		System.out.println();

		rect2.rectangleInfo();

	}

}
