/*
Largest subarray of 0's and 1's
Given an array arr of 0s and 1s. Find and return the length of the longest subarray with equal number of 0s and 1s.

Examples:

Input: arr[] = [1, 0, 1, 1, 1, 0, 0]
Output: 6
Explanation: arr[1...6] is the longest subarray with three 0s and three 1s.
*/

class Solution {
    public int maxLen(int[] arr) {
        Map<Integer , Integer> mp = new HashMap();
        mp.put(0,-1);
        int ans=0, sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]==1 ? 1:-1;
            if(mp.containsKey(sum)){
                ans=Math.max(ans, i-mp.get(sum));
            }else{
                mp.put(sum, i);
            }
        }
        return ans;
    }
}
