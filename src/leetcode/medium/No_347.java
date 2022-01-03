package leetcode.medium;

import java.util.stream.IntStream;

/*
 * 347. Top K Frequent Elements
 */
public class No_347 {
	
	
	public static int[] topKFrequent(int[] nums, int k) {
		
		
		return null;
    }
	
	
	public static void main (String [] args) {
		
		int [] nums = {1,1,1,2,2,3};
		int k = 2;
		int[] re = topKFrequent(nums, k);
		System.out.println();
		IntStream.of(re).forEach(System.out::println);
	}
}
