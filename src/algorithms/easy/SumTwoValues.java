package algorithms.easy.sorting;

import java.util.HashMap;
import java.util.Map;

public class SumTwoValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[] { 9, 2, 3, 4, 8 };
		int target = 7;
		int[] result = getTwoSum(inputArray, target);
		System.out.println(result[0] + " " + result[1]);

	}

	public static int[] getTwoSum(int[] inputArray, int target) {

		Map<Integer, Integer> visitedNumbers = new HashMap<>();
		int targetDiference, cont = 0;
		for (int valueInput : inputArray) {
			targetDiference = target - valueInput;
			if (visitedNumbers.containsKey(Integer.valueOf(targetDiference))) {
				return new int[] { visitedNumbers.get(targetDiference), cont };
			}

			visitedNumbers.put(valueInput, cont);
			cont++;
		}

		return new int[] { -1, -1 };
	}
}
