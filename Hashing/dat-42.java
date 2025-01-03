/*
Two Sum - Pair with Given Sum

Given an array arr[] of positive integers and another integer target. Determine if there exists two distinct indices such that the sum of there elements is equals to target.

Examples:

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.
*/
class Solution {
    boolean twoSum(int arr[], int target) {
        
        Set<Integer> hst = new HashSet();
        for(int i: arr){
            if(hst.contains(target-i)){
                return true;
            }
            hst.add(i);
        }
        return false;
    }
}
