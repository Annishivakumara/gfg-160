/*
Sum Pair closest to target

Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.
Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

Examples:

Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: As 5 + 20 = 25 is closest to 25.
*/


class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
       Arrays.sort(arr);
       List<Integer> ans=new ArrayList();
       int st=0,end=arr.length-1,currClose=Integer.MAX_VALUE;
       while(st<end){
           int sum=arr[st]+arr[end];
           if(Math.abs(target-sum)<currClose){
               currClose=Math.abs(target-sum);
               ans.clear();
               ans.add(arr[st]);
               ans.add(arr[end]);
           }
           if(sum<target){
               st++;
           }
           else if(sum>target){
               end--;
           }else{
               return ans;
           }
          
       }
        return ans;
    }
}
