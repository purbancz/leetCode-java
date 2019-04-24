package main.java.leetCode.Easy;

public class AvailableCapturesForRook {
	public int numRookCaptures(char[][] board) {
		int pawns = 0;
		int longitute = 0;
		int latitude = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'R') {
					latitude = i;
					longitute = j;
				}
			}
		}
		for (int i = latitude; i < board.length; i++) {
			if (board[i][longitute] == 'B') {
				break;
			}
			if (board[i][longitute] == 'p') {
				pawns++;
				break;
			}
		}
		for (int i = latitude; i >= 0; i--) {
			if (board[i][longitute] == 'B') {
				break;
			}
			if (board[i][longitute] == 'p') {
				pawns++;
				break;
			}
		}
		for (int i = longitute; i < board.length; i++) {
			if (board[latitude][i] == 'B') {
				break;
			}
			if (board[latitude][i] == 'p') {
				pawns++;
				break;
			}
		}
		for (int i = longitute; i >= 0; i--) {
			if (board[latitude][i] == 'B') {
				break;
			}
			if (board[latitude][i] == 'p') {
				pawns++;
				break;
			}
		}
		return pawns;
	}
}
