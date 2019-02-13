package algorithms.easy.sorting;

import java.io.IOException;
import java.util.Arrays;

public class InsertionSortPart2 {

	// Complete the insertionSort2 function below.
	static void insertionSort2(int n, int[] arr) {

		int tempValue;
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					tempValue = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tempValue;
				}
			}
			System.out.println(Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", ""));
		}
	}

	public static void main(String[] args) throws IOException {
		// int[] input = { 1, 4, 3, 5, 6, 2 };
		int[] input = { 3, 4, 7, 5, 6, 2, 1 };
		int size = 7;
		insertionSort2(size, input);
	}

}
