package oop;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// creating new instances
		MotorBike Ducati = new MotorBike(100);
		System.out.println(Ducati.getSpeed());
		MotorBike Honda = new MotorBike(100);
		System.out.println(Honda.getSpeed());
		MotorBike Sukuki = new MotorBike();

		Ducati.start();
		Honda.start();

		Ducati.setSpeed(200);
		Ducati.increaseSpeed(100);
		System.out.println(Ducati.getSpeed());
		Ducati.decreaseSpeed(500);
		System.out.println(Ducati.getSpeed());

		Honda.setSpeed(180);
		Honda.increaseSpeed(100);
		System.out.println(Honda.getSpeed());
		Honda.decreaseSpeed(500);
		System.out.println(Honda.getSpeed());

		// Ducati.setSpeed(50);
		// Honda.setSpeed(0);
	}

}
