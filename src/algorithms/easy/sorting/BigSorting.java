package algorithms.easy.sorting;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class BigSorting {

	// Complete the bigSorting function below.
	static String[] bigSorting(String[] unsorted) {

		Arrays.sort(unsorted, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return StringAsIntegerCompare((String) o1, (String) o2);
			}
		});

		for (String output : unsorted)
			System.out.println(output);

		return unsorted;
	}

	// 0 means s1=s2, 1 means s1>s2, -1 means s1<s2
	static int StringAsIntegerCompare(String s1, String s2) {
		if (s1.length() > s2.length())
			return 1;
		if (s1.length() < s2.length())
			return -1;
		for (int i = 0; i < s1.length(); i++) {
			if ((int) s1.charAt(i) > (int) s2.charAt(i))
				return 1;
			if ((int) s1.charAt(i) < (int) s2.charAt(i))
				return -1;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		String[] input = { "8", "1", "2", "100", "123034798498573417183401923711333345566",
				"31415926535897932384626433832795", "3084193741082938", "111", "200" };
		// String[] input = { "8", "1", "2", "100", "123034", "302937",
		// "3084193", "111", "200" };

		String[] result = bigSorting(input);
		System.out.println(result);
	}
}
