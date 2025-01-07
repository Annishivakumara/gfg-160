/*
Pair with given sum in a sorted array
You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of
the arr[] are in sorted order.
Note: pairs should have elements of distinct indexes. 

Examples :

Input: arr[] = [-1, 1, 5, 5, 7], target = 6
Output: 3
Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
*/

class Solution {
  int countPairs(int arr[], int target) {
      int ans=0,st=0,end=arr.length-1;
      while(st<end){
          int currSum=arr[st]+arr[end];
      if(currSum>target){
          end--;
      }
      else if(currSum<target){
          st++;
      }else{
          int e1=arr[st], e2=arr[end], c1=0, c2=0;
          while(st<=end && arr[st]==e1){
              st++;
              c1++;
          }while(st<=end && arr[end]==e2){
              end--;
              c2++;
          }
          if(e1==e2){
              ans+=(c1*(c1-1))/2;
          }else{
              ans+=c1*c2;
          }
      }
      }
      return ans;
    }
    
}
