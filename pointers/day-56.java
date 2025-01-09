/*
Indexes of Subarray Sum
Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) 
whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.
You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1].

Examples:

Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.
*/
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int currSum=0;
        Map<Integer, Integer> mp = new HashMap();
        ArrayList<Integer> ans= new ArrayList();
        mp.put(0, -1);
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            
            if(currSum==target){
                ans.add(1);
                ans.add(i+1);
                return ans;
            }
            
            if(mp.containsKey(currSum-target)){
                ans.add(mp.get(currSum-target)+2);
                ans.add(i+1);
                return ans;
            }
            else{
                mp.put(currSum, i);
            }
        }
        ans.add(-1);
        return ans;
    }
}
