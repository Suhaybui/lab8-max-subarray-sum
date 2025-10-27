public class MaxSubarraySolver {

    public static int bruteForceMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static int kadanesAlgorithmMaxSum(int[] arr) {
        int maxEnding = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            if (maxEnding > maxSoFar) {
                maxSoFar = maxEnding;
            }
        }
        return maxSoFar;
    }
}
