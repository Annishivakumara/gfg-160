/*
Longest Subarray with Sum K
Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements 
is equal to the given value k. If there is no subarray with sum equal to k, return 0.

Examples:

Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
Output: 6
Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
*/

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int currSum=0,ans=0;
        Map<Integer , Integer > mp = new HashMap();
        mp.put(0, -1);
    
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(mp.containsKey(currSum-k)){
                ans=Math.max(ans, i-mp.get(currSum-k));
            }
            mp.putIfAbsent(currSum, i);        }
            return ans;
    }
}
