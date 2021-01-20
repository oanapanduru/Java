package oop2;

public class Fan {
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private int speed;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void turnOn() {
		this.isOn = true;
	}

	public void turnOff() {
		this.isOn = false;
		setSpeed(0);
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color,
				isOn, speed);
	}
}

