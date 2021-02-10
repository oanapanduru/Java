package oop2.Interfaces;

public class Game2 implements Console {

	@Override
	public void up() {
		System.out.println("go up in game2");

	}

	@Override
	public void down() {
		System.out.println("go down in game2");

	}

	@Override
	public void left() {
		System.out.println("go left in game2");
	}

	@Override
	public void right() {
		System.out.println("go right in game2");
	}


}
