package GreedyMethod;

public class JumpGame {
	public static void main(String[] args) {
		int[] arr= {1,3,5,8,9,2,6,7,6,8,9};
		System.out.println(minJump(arr));
	}
	static int minJump(int[] arr) {
		int n=arr.length;
		
		if(arr[0] == 0) {
			return -1;
		}
		int maxReach=0;
		int currReach=0;
		int jump=0;
		
		for(int i=0; i<n; i++) {
			
			maxReach=Math.max(maxReach, i+arr[i]);
			if(maxReach>=n-1) {
				return jump+1;
			}
			
			if(i==currReach) {
				if(i==maxReach) {
					return -1;
				}
				
				else {
					jump++;
					currReach=maxReach;
				}
			}
		}
		return -1;
	}
}
