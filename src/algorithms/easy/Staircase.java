package algorithms.easy;

import java.io.IOException;

public class Staircase {

	// Complete the staircase function below.
	static void staircase(int n) {
		if (n <= 0 || n > 100)
			System.out.println("wrong input");

		char[][] rowChar = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j < n - i - 1){
					rowChar[i][j]=' ';
				} else {
					rowChar[i][j]='#';
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(""+rowChar[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {

		staircase(5);

	}
}
