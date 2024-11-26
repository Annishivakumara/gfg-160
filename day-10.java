/*
Kadane's Algorithm
Difficulty: MediumAccuracy: 36.28%Submissions: 1MPoints: 4
Given an integer array arr[]. You need to find the maximum sum of a subarray.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
  */
class Solution {
    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
          int preset=0 ;
          int sum=Integer.MIN_VALUE;
          for (int val:arr){
              preset+=val;
              sum=Math.max(preset,sum);
              if(preset<0){
                  preset=0;
              }
          }
          return preset;
    }
}
