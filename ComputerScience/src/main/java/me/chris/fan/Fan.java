package me.chris.fan;

public class Fan {

	private int SPEED;
	private boolean status;
	private double radius;
	private String color;

	public Fan() {

		SPEED = 1;
		status = false;
		radius = 5;
		color = "blue";

	}

	/*
	 * Speed Settings
	 */

	public int getSpeed() {
		return this.SPEED;

	}

	public void setSlowSpeed() {
		this.SPEED = 1;

	}

	public void setMediumSpeed() {
		this.SPEED = 2;

	}

	public void setFastSpeed() {
		this.SPEED = 3;

	}

	/*
	 * Status Settigs
	 */

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean setting) {
		this.status = setting;
	}

	/*
	 * Radius Settings
	 */

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/*
	 * Color Settings
	 */

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * Display Information
	 */

	@Override
	public String toString() {

		String info = "";

		if (getStatus() == true) {
			// fan sped, color, radius
			info = "Fan Speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius();

		} else {

			info = "Fan Speed: Fan is off!" + "\nColor: " + getColor() + "\nRadius: " + getRadius();
		}

		return info;

	}

}
