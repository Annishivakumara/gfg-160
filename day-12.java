class Solution {
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int s1 = 0, s2 = 0, totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            s1 += arr[i];
            if (s1 < 0) s1 = 0;
            maxSum = Math.max(maxSum, s1);
            s2 += arr[i];
            if (s2 > 0) s2 = 0;
            minSum = Math.min(minSum, s2);
        }

        if (totalSum == minSum) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}
