package algorithms.easy.sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * HackerRank Exercise
 * https://www.hackerrank.com/challenges/closest-numbers/problem
 */

public class ClosestNumbers {

	static void closestNumbers(int n, int[] arr) {

		// Arrays.sort(arr);
		int minDiference = 999999999;
		int diference;
		List<Integer> resultClosestNumbers = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i == j)
					continue;

				diference = arr[i] - arr[j];
				if (minDiference > diference) {
					minDiference = diference;
					if (resultClosestNumbers.size() > 0) {
						resultClosestNumbers.clear();
					} else {
						resultClosestNumbers.add(arr[i]);
						resultClosestNumbers.add(arr[j]);
					}
				}
			}
		}

		System.out.println("Result List: " + resultClosestNumbers);

		printArray(arr);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) throws IOException {
		int[] input = { 5, 4, 3, 2 };
		// int[] input = { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30,
		// 6246457, -6461594, 266854, -520, -470};
		int size = 4;
		// closestNumbers(size, input);

		//
		int[] array = input;
		int n = size;

		Arrays.sort(array);
		int minAbs = Integer.MAX_VALUE; // Minimum absolute difference
		StringBuilder pairs = new StringBuilder("");

		for (int i = 0; i < n - 1; i++) {
			int absDiff;

			if ((array[i] < 0 && array[i + 1] < 0) || (array[i] > 0 && array[i + 1] > 0))// both numbers have matching
																							// signs
				absDiff = Math.abs(array[i] - array[i + 1]); // Absolute difference
			else
				absDiff = Math.abs(array[i]) + Math.abs(array[i + 1]); // Absolute difference

			if (absDiff < minAbs) { // New minAbs
				minAbs = absDiff;
				pairs = new StringBuilder("");// Empty pairs
				pairs.append(array[i] + " " + array[i + 1] + " ");// Add pair
			} else if (absDiff == minAbs) {// Multiple minAbs
				pairs.append(array[i] + " " + array[i + 1] + " ");// Add pair
			}
		}
		System.out.println(pairs);

	}
}
