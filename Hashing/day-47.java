/*
 Longest Consecutive Subsequence

Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Examples:

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
*/



class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
       Set<Integer> hst= new HashSet();
       for(int i:arr){
           hst.add(i);
       }// code here
       int ans=0;
       for(int i:arr){
           int curr=0,tmp=i,tmp2=i-1;
           if(hst.contains(i)){
               while(hst.contains(tmp)){
                   curr++;
                   hst.remove(tmp);
                   tmp++;
               }
               
                 while(hst.contains(tmp2)){
                     curr++;
                     hst.remove(tmp2);
                     tmp2--;
           }
           
       }
           ans=Math.max(ans,curr);
       }
    
        return  ans;
    }
    
}
