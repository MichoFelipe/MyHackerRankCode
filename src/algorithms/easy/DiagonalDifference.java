package algorithms.easy;

import java.io.IOException;

public class DiagonalDifference {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {

		int result = 0;
		int size = arr[0].length;
		int sumDiagonalLeft = 0, sumDiagonalRight = 0;
		for (int i = 0; i < size; i++) {
			sumDiagonalLeft += arr[i][i];
			sumDiagonalRight += arr[i][size - i - 1];
		}
		result = Math.abs(sumDiagonalLeft - sumDiagonalRight);
		return result;
	}

	public static void main(String[] args) throws IOException {

		// Random values
		int size = 3;
		int[][] matrixOne = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrixOne[i][j] = (int) (Math.random() * 10);
			}
		}
		int result = diagonalDifference(matrixOne);
		System.out.println("result: " + result);
	}

}
