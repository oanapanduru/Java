package oop;

public class MotorBike {
	private int speed;// member variable

	void setSpeed(int speed) {// local variable
		this.speed = speed;
		System.out.println(speed);
		System.out.println(this.speed);


	}

	int getSpeed() {
		return this.speed;

	}

	void start() {
		System.out.println("motor bike is starting");
	}
}
	
	
