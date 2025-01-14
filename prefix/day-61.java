/*
Equilibrium Point
Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements
before that index is the same as the sum of elements after it. Return -1 if no such point exists. 
Examples:
Input: arr[] = [1, 2, 0, 3]
Output: 2 
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 0 + 3 = 3.
*/
class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
      int totalSum=0;
      for(int i:arr){
          totalSum+=i;
      }
      int currSum=0;
      for(int i=0;i<arr.length;i++){
          if(currSum==totalSum-currSum-arr[i]){
              return i;
          }
          currSum+=arr[i];
      }
      return -1;
    }
    
}
