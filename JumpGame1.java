package GreedyMethod;

public class JumpGame1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(canReachEnd(arr));
    }

    static boolean canReachEnd(int[] arr) {
        int n = arr.length;

        if (arr[0] == 0) return false;

        int maxReach = 0;
        int currReach = 0;

        for (int i = 0; i < n; i++) {
            maxReach = Math.max(maxReach, i + arr[i]);

            if (maxReach >= n - 1) {
                return true;
            }

            if (i == currReach) {
                if (i == maxReach) return false;
                currReach = maxReach;
            }
        }

        return false;
    }
}
