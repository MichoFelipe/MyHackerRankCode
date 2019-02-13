package algorithms.easy;

import java.io.IOException;
import java.util.Arrays;

public class MiniMaxSum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {

		long[] resultSum = new long[arr.length];
		long sumWithoutIndex;
		for (int i = 0; i < arr.length; i++) {
			sumWithoutIndex = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					sumWithoutIndex += arr[j];
				}
			}
			resultSum[i] = sumWithoutIndex;
		}

		long minSumValue = resultSum[0];
		long maxSumValue = resultSum[0];
		for (int i = 0; i < resultSum.length; i++) {
			if (resultSum[i] > maxSumValue)
				maxSumValue = resultSum[i];
			if (resultSum[i] < minSumValue)
				minSumValue = resultSum[i];
		}
		System.out.println(minSumValue + " " + maxSumValue);

	}

	static void miniMaxSum2(int[] arr) {
		int suma = 0;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			suma = suma + num;
		}
		Arrays.sort(arr);
		System.out.println((suma - arr[arr.length - 1]) + " " + (suma - arr[0]));
	}

	public static void main(String[] args) throws IOException {

		int[] in = new int[5];
		in[0] = 10;
		in[1] = 9;
		in[2] = 15;
		in[3] = 27;
		in[4] = 5;
		miniMaxSum(in);
		miniMaxSum2(in);
	}
}
