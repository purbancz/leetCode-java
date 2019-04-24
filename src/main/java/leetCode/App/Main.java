package main.java.leetCode.App;

import main.java.leetCode.Easy.AvailableCapturesForRook;

public class Main {

	public static void main(String[] args) {

		AvailableCapturesForRook object = new AvailableCapturesForRook();

		char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', 'p', '.', '.', '.', '.' },
				{ '.', '.', '.', 'R', '.', '.', '.', 'p' }, { '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', 'p', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.' } };

		char[][] board2 = { { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', 'p', '.', '.', '.', '.' },
				{ '.', '.', '.', 'p', '.', '.', '.', '.' }, { 'p', 'p', '.', 'R', '.', 'p', 'B', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', 'B', '.', '.', '.', '.' },
				{ '.', '.', '.', 'p', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.' } };
		System.out.println(object.numRookCaptures(board));
		System.out.println(object.numRookCaptures(board2));
		System.out.println("koniec");

	}

}
