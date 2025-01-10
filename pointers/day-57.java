/*
Count distinct elements in every window

Given an integer array arr[] and a number k. Find the count of distinct elements in every window of size k in the array.

Examples:

Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
Output:  [3, 4, 4, 3]
Explanation: Window 1 of size k = 4 is 1 2 1 3. Number of distinct elements in this window are 3. 
Window 2 of size k = 4 is 2 1 3 4. Number of distinct elements in this window are 4.
Window 3 of size k = 4 is 1 3 4 2. Number of distinct elements in this window are 4.
Window 4 of size k = 4 is 3 4 2 3. Number of distinct elements in this window are 3.
*/

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
     ArrayList<Integer> ans = new ArrayList();
     Map<Integer , Integer> mp = new HashMap();
     k--;
     for(int i=0;i<arr.length;i++){
         mp.put(arr[i], mp.getOrDefault(arr[i], 0 )+1);
         if(i<k){
             continue;
         }
         ans.add(mp.size());
         if(mp.get(arr[i-k])==1){
             mp.remove(arr[i-k]);
         }
         else{
             mp.put(arr[i-k], mp.get(arr[i-k])-1);
         }
     }
     return ans;
    }
}
