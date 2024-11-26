/*
Minimize the Heights II
Difficulty: MediumAccuracy: 15.06%Submissions: 636K+Points: 4
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.

Examples :

Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.
  */
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
