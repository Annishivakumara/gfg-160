/*
Set Matrix Zeroes

You are given a 2D matrix mat[][] of size n×m. The task is to modify the matrix such that if mat[i][j] is 0, 
all the elements in the i-th row and j-th column are set to 0 and do it in constant space complexity.

Examples:

Input: mat[][] = [[1, -1, 1],
                [-1, 0, 1],
                [1, -1, 1]]
Output: [[1, 0, 1],
        [0, 0, 0],
        [1, 0, 1]]
Explanation: mat[1][1] = 0, so all elements in row 1 and column 1 are updated to zeroes.
*/
class Solution {

    
    
    public void setMatrixZeroes(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        boolean isFirstColZero = false;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    if(j==0){
                        isFirstColZero = true;
                    }
                    else {
                        mat[i][0]=0;
                        mat[0][j]=0;
                    }
                }
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(mat[i][0]==0 || mat[0][j] == 0){
                    mat[i][j]=0;
                }
            }
        }
        if(mat[0][0]==0){
            for(int i=0;i<c;i++){
                mat[0][i]=0;
            }
        }
        if(isFirstColZero){
            for(int i=0;i<r;i++){
                mat[i][0]=0;
            }
        }
    }
}