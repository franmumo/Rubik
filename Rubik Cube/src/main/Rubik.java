package main;


public class Rubik {
	private color cube[][][];

	public enum color {
		BLUE, YELLOW, GREEN, WHITE, ORANGE, REDD
	}

	public Rubik() {
		cube = new color[6][3][3];
	}

	public static void main(String[] args) {
		Rubik r = new Rubik();
	}
}
