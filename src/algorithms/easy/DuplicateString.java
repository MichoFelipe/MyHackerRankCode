package algorithms.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am am Java Developer Java Java";
		findDuplicateWord(input);
	}

	public static void findDuplicateWord(String str) {

		String[] inputChar = str.split(" ");
		Map<String, Integer> mapDuplicate = new HashMap<>();
		for (String value : inputChar) {
			if (mapDuplicate.containsKey(value)) {
				mapDuplicate.put(value, mapDuplicate.get(value) + 1);
			} else {
				mapDuplicate.put(value, 1);
			}
		}

		Iterator<String> it = mapDuplicate.keySet().iterator();
		while (it.hasNext()) {
			String keyChar = it.next();
			if (mapDuplicate.get(keyChar) > 1) {
				System.out.println("The Key: " + keyChar + " has " + mapDuplicate.get(keyChar) + " ocurrences");
			}
		}

	}

}
