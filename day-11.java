/*
Maximum Product Subarray
Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr.

Note: It is guaranteed that the output fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.*/
class Solution {
    int getMinDiff(int[] arr, int k) {
        int n=arr.length;
       Arrays.sort(arr);
       
       int ans=arr[n-1]-arr[0];
       
       int smallest=arr[0]+k;
       int largest=arr[n-1]-k;
       int minimum=0,maximum=0;
       for (int i=0;i<n-1;i++){
           minimum=Math.min(smallest,arr[i+1]-k);
           maximum=Math.max(largest,arr[i]+k);
           if(minimum<0){
               continue;
           }
           ans=Math.min(ans,maximum-minimum);
       }
       return ans;
    }
}
