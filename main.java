import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[][] array = new char[3][3];
		String input;
		int offset = 0;
		int xCounter = 0;
		int oCounter = 0;
		System.out.print("Enter cells: ");
		input = scanner.next();

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {

				array[i][j] = input.charAt(offset++);
			}
		}

		System.out.println("---------");
		for (int i = 0; i < array.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("|");
		}
		System.out.println("---------");

		// check if X win
		boolean xWin = false;

		if (array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X') {
			xWin = true;
		} else if (array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X') {
			xWin = true;
		} else if (array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X') {
			xWin = true;
		} else if (array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X') {
			xWin = true;
		} else if (array[2][0] == 'X' && array[1][1] == 'X' && array[0][2] == 'X') {
			xWin = true;
		} else if (array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X') {
			xWin = true;
		} else if (array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X') {
			xWin = true;
		} else if (array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X') {
			xWin = true;
		}

		// check if O win

		boolean oWin = false;

		if (array[0][0] == 'O' && array[0][1] == 'O' && array[0][2] == 'O') {
			oWin = true;
		} else if (array[1][0] == 'O' && array[1][1] == 'O' && array[1][2] == 'O') {
			oWin = true;
		} else if (array[2][0] == 'O' && array[2][1] == 'O' && array[2][2] == 'O') {
			oWin = true;
		} else if (array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O') {
			oWin = true;
		} else if (array[2][0] == 'O' && array[1][1] == 'O' && array[0][2] == 'O') {
			oWin = true;
		} else if (array[0][0] == 'O' && array[1][0] == 'O' && array[2][0] == 'O') {
			oWin = true;
		} else if (array[0][1] == 'O' && array[1][1] == 'O' && array[2][1] == 'O') {
			oWin = true;
		} else if (array[0][2] == 'O' && array[1][2] == 'O' && array[2][2] == 'O') {
			oWin = true;
		}

		// check how many X and O

		for (char ch[] : array) {
			for (char character : ch) {
				if (character == 'X') {
					xCounter++;
				} else if (character == 'O') {
					oCounter++;
				}
			}
		}

		// check if there is empty space

		if (oWin == false && xWin == false) {
			if (xCounter + 1 < oCounter || oCounter + 1 < xCounter) {
				System.out.println("Impossible");
			} else {
				for (char ch[] : array) {
					for (char character : ch) {
						if (character == '_') {
							System.out.println("Game not finished");
							break;
						} else {
							System.out.println("Draw");
							break;
						}

					}
				}
			}
		} else if (oWin == true && xWin == true) {
			System.out.println("Impossible");
		} else if (oWin == true || xWin == true) {
			if (xCounter + 2 < oCounter || oCounter + 2 < xCounter) {
				System.out.println("Impossible");
			} else if (oWin == true && xWin == false) {
				System.out.println("O wins");
			} else if (oWin == false && xWin == true) {
				System.out.println("X wins");
			}
		} else {
			System.out.println("Impossible");
		}

	}

}


