package me.chris.fan;

public class FanTest {

	public static void main(String[] args) {

		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		// First Fan
		fan1.setFastSpeed();
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		fan1.setStatus(true);

		// Second Fan
		fan2.setMediumSpeed();
		fan2.setRadius(5); // Don't need this, as default radius is 5
		fan2.setColor("Blue"); // Don't need this, as default color is blue
		fan2.setStatus(false); // Don't need this, as default status is false

		System.out.println(fan1.toString());
		System.out.println();
		System.out.println(fan2.toString());

	}

}
