/*
Search in a sorted Matrix

Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

Examples:

Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
Output: true
Explanation: 14 is present in the matrix, so output is true.
  */
class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
     int n=mat.length;
     int m=mat[0].length;
     int low=0, high=n*m-1;
   
     
     while(low<=high){
         
         int mid=(low+high)/2;
         int rownum=mid/m;
         int colnum=mid%m;
         if(mat[rownum][colnum]==x){
             return true;
         }
         if(mat[rownum][colnum]<x){
            low=mid+1;
         }else{
             high=mid-1;
         }
     }
     return false;
    }
    }
