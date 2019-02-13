package algorithms.easy.sorting;

import java.io.IOException;
import java.util.Arrays;

public class InsertionSortPart1 {

	// Complete the insertionSort1 function below.
	static void insertionSort1(int n, int[] arr) {

		int valToRemove = arr[n - 1];
		int i;
		for (i = arr.length - 2; (i >= 0) && (arr[i] > valToRemove); i--) {
			arr[i + 1] = arr[i];
			System.out.println(Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", ""));
		}
		arr[i + 1] = valToRemove;
		System.out.println(Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", ""));
	}

	public static void main(String[] args) throws IOException {
		int[] input = { 2, 4, 6, 8, 3 };
		// int[] input = { 1, 2, 4, 5, 3 };
		int posToRemove = 5;
		insertionSort1(posToRemove, input);
	}
}
