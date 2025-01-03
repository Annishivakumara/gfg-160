/*
Count Subarrays with given XOR
Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.

Examples: 

Input: arr[] = [4, 2, 2, 6, 4], k = 6
Output: 4
Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and [6]. Hence, the answer is 4.
*/

class Solution {
    public long subarrayXor(int arr[], int k) {
       long ans=0;
       Map<Integer , Integer > mp = new HashMap();
       int currXOR=0;
       mp.put(0,1);
       for(int i:arr){
           currXOR=currXOR^i;
           if(mp.containsKey(currXOR^k))
               ans+=mp.get(currXOR^k);
              mp.put(currXOR, mp.getOrDefault(currXOR, 0)+1);
       }
       return ans;
    }
}
