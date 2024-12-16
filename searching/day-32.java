/*
K-th element of two Arrays

Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

Examples :
Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
  */
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i =0 , j =0, n = a.length, m =b.length, ans,c =0;
        
        while(true){
            int x1 = i<n ? a[i] : Integer.MAX_VALUE;
            int x2 = j<m ? b[j] : Integer.MAX_VALUE;
            
            if(x1 < x2){
                i++;
                ans = x1;
            }
            else {
                j++;
                ans = x2;
            }
            c++;
            if(c == k){
                return ans;
            }
        }
    
    }
}
