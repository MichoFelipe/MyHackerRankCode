package algorithms.easy;

import java.io.IOException;

public class AVeryBigSum {

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] input) {

		Long sum = 0L;
		for (long in : input) {
			sum = sum + Long.valueOf(in);
		}
		return sum;

	}

	public static void main(String[] args) throws IOException {

		long[] in = new long[5];
		in[0] = 1000000001;
		in[1] = 1000000002;
		in[2] = 1000000003;
		in[3] = 1000000004;
		in[4] = 1000000005;

		long result = aVeryBigSum(in);
		System.out.println("result: " + result);

	}

}
