/*
Kth Missing Positive Number in a Sorted Array

Given a sorted array of distinct positive integers arr[], we need to find the kth positive number that is missing from arr[].  

Examples :

Input: arr[] = [2, 3, 4, 7, 11], k = 5
Output: 9
Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.
*/
class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int lo=0, hi = arr.length-1;
        int ans = arr.length + k;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > mid + k){
                hi = mid - 1;
                ans = mid + k;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
