package main;

public class Rubik {

	public static final int YELLOW = 0;
	public static final int BLUE = 1;
	public static final int GREEN = 2;
	public static final int WHITE = 3;
	public static final int ORANGE = 4;
	public static final int RED = 5;

	private int cube[][][];

	// Contructor
	public Rubik() {
		cube = new int[6][3][3];

		// Un color por cara
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					cube[i][j][k] = i;
				}
			}
		}
	};

	public void spinUp() {
		// Itero primero por cada pieza de cada cara
		for (int i = 0; i < 3; i++) {
			int aux = cube[0][0][i];
			// Itero cada cara
			for (int j = 0; j < 3; j++) {
				cube[j][0][i] = cube[j + 1][0][i];
			}
			cube[3][0][i] = aux;
		}
		System.out.println("U");
	};

	public void spinBottom() {
		// Itero primero por cada pieza de cada cara
		for (int i = 0; i < 3; i++) {
			int aux = cube[0][2][i];
			// Itero cada cara
			for (int j = 0; j < 3; j++) {
				cube[j][2][i] = cube[j + 1][2][i];
			}
			cube[3][2][i] = aux;
		}
		System.out.println("B");
	};

	public void spinLessUp() {
		// Itero primero por cada pieza de cada cara
		for (int i = 0; i < 3; i++) {
			int aux = cube[2][0][i];
			// Itero cada cara
			for (int j = 3; j >= 1; j--) {
				cube[j][0][i] = cube[j - 1][0][i];
			}
			cube[0][0][i] = aux;
		}
		System.out.println("LU");
	};

	public void spinLessBottom() {
		// Itero primero por cada pieza de cada cara
		for (int i = 0; i < 3; i++) {
			int aux = cube[2][2][i];
			// Itero cada cara
			for (int j = 3; j >= 1; j--) {
				cube[j][2][i] = cube[j - 1][2][i];
			}
			cube[0][2][i] = aux;
		}
		System.out.println("LB");
	};

	public void spinFront() {
		int aux[] = new int[3];
		aux[0] = cube[0][0][2];
		aux[1] = cube[0][1][2];
		aux[2] = cube[0][2][2];

		cube[0][0][2] = cube[4][2][2];
		cube[0][1][2] = cube[4][2][1];
		cube[0][2][2] = cube[4][2][0];

		cube[4][2][0] = cube[2][0][0];
		cube[4][2][1] = cube[2][1][0];
		cube[4][2][2] = cube[2][2][0];

		cube[2][0][0] = cube[5][0][2];
		cube[2][1][0] = cube[5][0][1];
		cube[2][2][0] = cube[5][0][0];

		cube[5][0][0] = aux[0];
		cube[5][0][1] = aux[1];
		cube[5][0][2] = aux[2];

		System.out.println("F");
	};

	public void spinBack() {
		int aux[] = new int[3];
		aux[0] = cube[0][0][0];
		aux[1] = cube[0][1][0];
		aux[2] = cube[0][2][0];

		cube[0][0][0] = cube[4][0][2];
		cube[0][1][0] = cube[4][0][1];
		cube[0][2][0] = cube[4][0][0];

		cube[4][0][0] = cube[2][0][2];
		cube[4][0][1] = cube[2][1][2];
		cube[4][0][2] = cube[2][2][2];

		cube[2][0][2] = cube[5][2][2];
		cube[2][1][2] = cube[5][2][1];
		cube[2][2][2] = cube[5][2][0];

		cube[5][2][0] = aux[0];
		cube[5][2][1] = aux[1];
		cube[5][2][2] = aux[2];

		System.out.println("B");
	};

	public void spinRigth() {
		int aux[] = new int[3];
		aux[0] = cube[1][0][2];
		aux[1] = cube[1][1][2];
		aux[2] = cube[1][2][2];

		cube[1][0][2] = cube[4][0][2];
		cube[1][1][2] = cube[4][1][2];
		cube[1][2][2] = cube[4][2][2];

		cube[4][0][2] = cube[3][2][0];
		cube[4][1][2] = cube[3][1][0];
		cube[4][2][2] = cube[3][0][0];

		cube[3][0][0] = cube[5][2][2];
		cube[3][1][0] = cube[5][1][2];
		cube[3][2][0] = cube[5][0][2];

		cube[5][0][2] = aux[0];
		cube[5][1][2] = aux[1];
		cube[5][2][2] = aux[2];

		System.out.println("R");
	};

	public void spinLeft() {
		int aux[] = new int[3];
		aux[0] = cube[0][0][0];
		aux[1] = cube[0][1][0];
		aux[2] = cube[0][2][0];

		cube[0][0][0] = cube[4][0][0];
		cube[0][1][0] = cube[4][1][0];
		cube[0][2][0] = cube[4][2][0];

		cube[4][0][0] = cube[3][2][2];
		cube[4][1][0] = cube[3][1][2];
		cube[4][2][0] = cube[3][0][2];

		cube[2][0][2] = cube[5][2][0];
		cube[2][1][2] = cube[5][1][0];
		cube[2][2][2] = cube[5][0][0];

		cube[5][0][0] = aux[0];
		cube[5][1][0] = aux[1];
		cube[5][2][0] = aux[2];

		System.out.println("L");
	};

	public void spinLessFront() {
		int aux[] = new int[3];
		aux[0] = cube[0][0][2];
		aux[1] = cube[0][1][2];
		aux[2] = cube[0][2][2];

		cube[4][2][2] = cube[0][0][2];
		cube[4][2][1] = cube[0][1][2];
		cube[4][2][0] = cube[0][2][2];

		cube[2][0][0] = cube[4][2][0];
		cube[2][1][0] = cube[4][2][1];
		cube[2][2][0] = cube[4][2][2];

		cube[5][0][2] = cube[2][0][0];
		cube[5][0][1] = cube[2][1][0];
		cube[5][0][0] = cube[2][2][0];

		cube[5][0][0] = aux[0];
		cube[5][0][1] = aux[1];
		cube[5][0][2] = aux[2];

		System.out.println("LF");
	};

	public void spinLessBack() {
		int aux[] = new int[3];
		aux[0] = cube[0][0][0];
		aux[1] = cube[0][1][0];
		aux[2] = cube[0][2][0];

		cube[4][0][2] = cube[0][0][0];
		cube[4][0][1] = cube[0][1][0];
		cube[4][0][0] = cube[0][2][0];

		cube[2][0][2] = cube[4][0][0];
		cube[2][1][2] = cube[4][0][1];
		cube[2][2][2] = cube[4][0][2];

		cube[5][2][2] = cube[2][0][2];
		cube[5][2][1] = cube[2][1][2];
		cube[5][2][0] = cube[2][2][2];

		cube[5][2][0] = aux[0];
		cube[5][2][1] = aux[1];
		cube[5][2][2] = aux[2];

		System.out.println("LB");
	};

	public void spinLessRight() {
		int aux[] = new int[3];
		aux[0] = cube[1][0][2];
		aux[1] = cube[1][1][2];
		aux[2] = cube[1][2][2];

		cube[4][0][2] = cube[1][0][2];
		cube[4][1][2] = cube[1][1][2];
		cube[4][2][2] = cube[1][2][2];

		cube[3][2][0] = cube[4][0][2];
		cube[3][1][0] = cube[4][1][2];
		cube[3][0][0] = cube[4][2][2];

		cube[5][2][2] = cube[3][0][0];
		cube[5][1][2] = cube[3][1][0];
		cube[5][0][2] = cube[3][2][0];

		cube[5][0][2] = aux[0];
		cube[5][1][2] = aux[1];
		cube[5][2][2] = aux[2];

		System.out.println("LR");
	};

	public void spinLessLeft() {
		int aux[] = new int[3];
		aux[0] = cube[0][0][0];
		aux[1] = cube[0][1][0];
		aux[2] = cube[0][2][0];

		cube[4][0][0] = cube[0][0][0];
		cube[4][1][0] = cube[0][1][0];
		cube[4][2][0] = cube[0][2][0];

		cube[3][2][2] = cube[4][0][0];
		cube[3][1][2] = cube[4][1][0];
		cube[3][0][2] = cube[4][2][0];

		cube[5][2][0] = cube[2][0][2];
		cube[5][1][0] = cube[2][1][2];
		cube[5][0][0] = cube[2][2][2];

		cube[5][0][0] = aux[0];
		cube[5][1][0] = aux[1];
		cube[5][2][0] = aux[2];

		System.out.println("LL");
	};

	public void printFace(int num) {
		if (num >= 4) {
			// Lineas del cubo
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 7; j++) {
					System.out.print(" ");
				}
				System.out.print(" ");
				for (int j = 0; j < 3; j++) {
					System.out.print(cube[num][i][j]);
					System.out.print(" ");
				}
				for (int j = 0; j < 7 * 2; j++) {
					System.out.print(" ");
				}
				System.out.print("\n");
			}
			
			// Linea vacia
			for (int i = 0; i < 7 * 4; i++) {
				System.out.print(" ");
			}
			System.out.print("\n");
			
		} else {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(" ");
					for (int k = 0; k < 3; k++) {
						System.out.print(cube[j][i][k]);
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
			// Linea vacia
			for (int i = 0; i < 7 * 4; i++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	public void printCube() {
		printFace(4);
		printFace(1);
		printFace(5);
	}

	public static void main(String[] args) {
		Rubik cubo = new Rubik();
		cubo.printCube();
		cubo.spinBack();
		cubo.printCube();
		cubo.spinFront();
		cubo.printCube();
		cubo.spinRigth();
		cubo.printCube();
		cubo.spinBottom();
		cubo.printCube();
	}
}
