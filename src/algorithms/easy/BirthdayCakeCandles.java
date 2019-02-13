package algorithms.easy;

import java.io.IOException;

public class BirthdayCakeCandles {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {

		int candleMoreHigher = ar[0];
		int contClandlesHigher = 0;
		for (int i = 0; i < ar.length; i++) {
			if (candleMoreHigher < ar[i]) {
				candleMoreHigher = ar[i];
				contClandlesHigher = 1;
			} else if (candleMoreHigher == ar[i]) {
				contClandlesHigher++;
			}
		}
		return contClandlesHigher;
	}

	public static void main(String[] args) throws IOException {
		int[] in = new int[4];
		in[0] = 3;
		in[1] = 2;
		in[2] = 1;
		in[3] = 3;
		int result = birthdayCakeCandles(in);
		System.out.println(result);
	}
}
