package oop2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer", 0.1223, "white");
		fan.turnOn();
		fan.setSpeed(3);
		System.out.println(fan);
	}

}
