package algorithms.easy.sorting;

import java.io.IOException;

public class CorrectnessandtheLoopInvariant {

	public static void insertionSort(int[] A) {

		int cont=0;
		for (int i = 1; i < A.length; i++) {
			int value = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > value) {
				A[j + 1] = A[j];
				j = j - 1;
				cont++;
			}
			A[j + 1] = value;
		}

		printArray(A);
		System.out.println("Cont: "+cont);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) throws IOException {
		// int[] input = { 1, 4, 3, 5, 6, 2 };
		//int[] input = { 7, 4, 3, 5, 6, 2 };
		int[] input = { 2, 1, 3, 1, 2 };
		insertionSort(input);
	}
}
