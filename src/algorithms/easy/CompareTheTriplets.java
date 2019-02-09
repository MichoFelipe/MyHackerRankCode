package algorithms.easy;

import java.io.*;
import java.util.*;

public class CompareTheTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		List<Integer> result = new ArrayList<>();
		Iterator<Integer> inputOne = a.iterator();
		Iterator<Integer> inputTwo = b.iterator();
		int valueOne, valueTwo;
		int winGamesOne = 0, winGamesTwo = 0;
		while (inputOne.hasNext()) {
			valueOne = inputOne.next().intValue();
			valueTwo = inputTwo.next().intValue();
			if (valueOne > valueTwo) {
				winGamesOne++;
			} else if (valueOne < valueTwo) {
				winGamesTwo++;
			}
		}
		result.add(winGamesOne);
		result.add(winGamesTwo);

		return result;
	}

	public static void main(String[] args) throws IOException {

		List<Integer> result = compareTriplets(new ArrayList<Integer>() {
			{
				add(17);
				add(28);
				add(30);
			}
		}, new ArrayList<Integer>() {
			{
				add(99);
				add(16);
				add(8);
			}
		});

		System.out.println("Print List Result: " + result);

	}
}
