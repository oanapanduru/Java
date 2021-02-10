package oop2.Interfaces;

public class GameRunner {

	public static void main(String[] args) {
		// Game game = new Game();
		Console game = new Game();
		Game2 game2 = new Game2();
		game.down();
		game.up();
		game.left();
		game.right();
		game2.down();
		game2.up();
		game2.left();
		game2.right();

	}

}
