package algorithms.easy.sorting.cssdojo;

import java.io.IOException;

public class LongestConsecutiveCharacters {

	public static void insertionSort(String input) {
		char[] inputChar = input.toCharArray();
		int maxSize=0; int cont = 0;
		String charMaxSize=null;		
		for (int i = 0; i < input.length() - 1; i++) {
			if (inputChar[i + 1] == inputChar[i]) {
				cont++;
			} else {
				cont= 1;
			}
			if( cont > maxSize ){
				charMaxSize = String.valueOf(inputChar[i]);
				maxSize = cont;
			}
		}
		System.out.println("charMaxSize: "+charMaxSize);
		System.out.println("maxSize: "+maxSize);
	}

	public static void main(String[] args) throws IOException {
		// int[] input = { 1, 4, 3, 5, 6, 2 };
		// int[] input = { 7, 4, 3, 5, 6, 2 };
		String input = "AABCCCCDDBBBBBEA";
		insertionSort(input);
	}

}
