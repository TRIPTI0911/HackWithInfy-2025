package GreedyMethod;

import java.util.*;
public class ArrayPartition {
	public static void main(String[] args) {
		int n=4;
		int[] arr= {1,4,3,2};
		
		Arrays.sort(arr);
		int result=0;
		for(int i=0; i<arr.length; i+=2) {
			result+=arr[i];
		}
		
		System.out.println(result);
		
	}
}



//Problem Description:
//Given an array of 2n integers, group these integers into n pairs to maximize the sum of the
//minimums in each pair.
//Input Format:
//• n → Number of pairs
//• nums[] → Array of 2n integers
//Output Format:
//• Maximum sum of minimums in all pairs.
//Constraints:
//• 1 ≤ n ≤ 10000
//• -10000 ≤ nums[i] ≤ 10000
//Sample Input:
//4
//1 4 3 2
//Sample Output:
//4