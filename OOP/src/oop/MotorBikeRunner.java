package oop;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// creating new instances
		MotorBike Ducati = new MotorBike();
		MotorBike Honda = new MotorBike();

		Ducati.start();
		Honda.start();

		Ducati.setSpeed(200);
		System.out.println(Ducati.getSpeed());
		Honda.setSpeed(180);
		System.out.println(Honda.getSpeed());

		// Ducati.setSpeed(50);
		// Honda.setSpeed(0);
	}

}
