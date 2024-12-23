/*
Implement Lower Bound

Given a sorted array arr[] and a number target, the task is to find the lower bound of the target in this given array. The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the given number.

Note: If all the elements in the given array are smaller than the target, the lower bound will be the length of the array. 

Examples :
Input:  arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
Output: 3
Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is greater than or equal to 9.
*/
package search.gfg_160;
public class impliment_lower_bound {
      public static int  lowerset(int [] arr, int target){
        int n=arr.length;
        int ans=n;
        int low=0,high=n-1; 
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]>=target){
                 ans=mid;
                 high=mid-1;
                }else{
                low=mid+1;
                }
            }
        return ans;
      }
public static void main(String[]args){
              int [] arr={3,5,8,15,19};
              System.out.println("Array is in sorted Order: ");
              System.out.println(lowerset(arr,8));       
}
}


/*----------------------------------------------------------------------------------------------------------
GFG METHOD:-
--------------------------------------------------------------------------------------------------------
  class Solution {
    int lowerBound(int[] arr, int target) {
    int n=arr.length;
      int low=0,high=n-1;
      int answer=n;
     
      
          while(low<=high){
              int mid=(low+high)/2;
              if(arr[mid]>=target){
                  answer=mid;
                  high=mid-1;
              }else{
                  low=mid+1;
              }
          }

      return answer;
    }
}
*/
