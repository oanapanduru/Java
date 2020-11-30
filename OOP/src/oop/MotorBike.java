package oop;

public class MotorBike {
	private int speed;// member variable

	void setSpeed(int speed) {// local variable
		if (speed > 0) {
			this.speed = speed;
		}


	}

	int getSpeed() {
		return this.speed;

	}

	void start() {
		System.out.println("motor bike is starting");
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}
	
	
