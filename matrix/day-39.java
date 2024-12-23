/*
Search in a row-wise sorted matrix

Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.
Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].

Examples :

Input: mat[][] = [[3, 4, 9],[2, 5, 6],[9, 25, 27]], x = 9
Output: true
Explanation: 9 is present in the matrix, so the output is true.
*/



class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        
         for(int i=0;i<mat.length;i++){
              int low=0,high=mat[0].length-1;
         while(low<=high){
             int mid=(low+high)/2;
             
             if(mat[i][mid]==x){
                  return true;
             }
             if(mat[i][mid]<x){
                  low=mid+1;
             }else{
                 high=mid-1;
             }
         }
        
         }
          return false;
    }
}
