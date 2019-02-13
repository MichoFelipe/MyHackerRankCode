package algorithms.easy;

import java.io.IOException;

public class SimpleArraySum {

	   /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
    	int totalSumArray = 0;
    	for( int i = 0; i<ar.length; i++){
    		totalSumArray+= ar[i];
    	}
    	return totalSumArray;
    }
    
    public static void main(String[] args) throws IOException {
		int[] in = new int[2];
		in[0] = 3;
		in[1] = 2;
		int result = simpleArraySum(in);
		System.out.println(result);
    }
}
