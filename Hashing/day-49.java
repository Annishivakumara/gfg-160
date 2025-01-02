/*
 Subarrays with sum K

Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.

Examples:

Input: arr = [10, 2, -2, -20, 10], k = -10
Output: 3
Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.
*/




class Solution {
    public int countSubarrays(int arr[], int k) {
       int ans=0, currrentsum=0;
       Map<Integer , Integer> mp = new HashMap();
       mp.put(0,1);
       for(int i: arr){
          currrentsum+=i;
          if(mp.containsKey(currrentsum-k)){
              ans+=mp.get(currrentsum-k);
          }
          mp.put(currrentsum,mp.getOrDefault(currrentsum,0)+1);
       }
       return ans;
    }
}
