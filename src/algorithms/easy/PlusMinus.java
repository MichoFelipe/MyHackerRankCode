package algorithms.easy;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PlusMinus {

	// Complete the plusMinus function below. 
	static void plusMinus(int[] arr) {

		int size = arr.length;
		int contPositive = 0, contZero = 0, contNegative = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] > 0)
				contPositive++;
			else if (arr[i] == 0)
				contZero++;
			else
				contNegative++;
		}

		DecimalFormat df = new DecimalFormat("#.#####");
		df.setRoundingMode(RoundingMode.CEILING);

		System.out.println(new BigDecimal((double) contPositive / (double) size).setScale(5, RoundingMode.HALF_EVEN));
		System.out.println(new BigDecimal((double) contNegative / (double) size).setScale(5, RoundingMode.HALF_EVEN));
		System.out.println(new BigDecimal((double) contZero / (double) size).setScale(5, RoundingMode.HALF_EVEN));

	}

	public static void main(String[] args) throws IOException {
		int[] in = new int[6];
		in[0] = -4;
		in[1] = 3;
		in[2] = -9;
		in[3] = 0;
		in[4] = 4;
		in[5] = 1;

		plusMinus(in);
	}

}
