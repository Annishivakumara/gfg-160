/*
Count pairs with given sum

Given an array arr[] and an integer target. You have to find numbers of pairs in array arr[] which sums up to given target.

Examples:

Input: arr[] = [1, 5, 7, -1, 5], target = 6 
Output: 3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
*/

class Solution {

    int countPairs(int arr[], int target) {
        Map<Integer, Integer> map= new HashMap();
        int count=0;
        for(int i:arr){
            if(map.containsKey(target-i)){
                count+=map.get(target-i);
                
                
            }
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        return count;
    }
}
