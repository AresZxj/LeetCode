package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku_36 {
	public boolean isValidSudoku(char[][] board) {
		boolean[][] target = new boolean[9+9+8][9];
		for(int i = 0; i < 9 + 9 + 8; ++i) {
			boolean[] temp = new boolean[9];
			target[i] = temp;
		}
		for(int i = 0; i < board.length; ++i) {
			for(int j = 0; j < board[i].length; ++j) {
				if(board[i][j] == '.') {
					continue;
				}
				int num = board[i][j] - '1';
				System.out.println(num+1);
				if(target[i][num] == false) {
					target[i][num] = true;
				} else {
					return false;
				}
				if(target[9+j][num] == false) {
					target[9+j][num] = true;
				} else {
					return false;
				}
				int ceil = i/3*3 + j/3;
				if(target[9+9+ceil][num] == false) {
					target[9+9+ceil][num] = true;
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		ValidSudoku_36 solution = new ValidSudoku_36();
		String[] ceilsData = {"..4...63.",".........","5......9.","...56....","4.3.....1","...7.....","...5.....",".........","........."};
		char[][] ceils = new char[9][9];
		for(int i = 0; i < 9; ++i) {
			ceils[i] = ceilsData[i].toCharArray();
		}
		System.out.println(solution.isValidSudoku(ceils));
	}
}
