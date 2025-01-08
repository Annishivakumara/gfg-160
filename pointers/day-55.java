/*
Count the number of possible triangles
Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle. 

A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.

Examples:

Input: arr[] = [4, 6, 3, 7]
Output: 3
Explanation: There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle
*/

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
       Arrays.sort(arr);
       int ans=0;
       for(int i=arr.length-1;i>=0;i--){
           int st=0,end=i-1;
           while(st<end){
               if(arr[st]+arr[end]>arr[i]){
                   ans+=end-st;
                   end--;
               }else{
                   st++;
               }
           }
       }
       return ans;
    }
}
