/*
Spirally traversing a matrix

You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

Examples:

Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

*/


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.

    // code is basically same for java and C++. just the syntax is different. So, I am not repeating the code for C++. Hope you understand.

    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        int r = mat.length, c = mat[0].length;
        int top = 0, down = r-1, left = 0, right = c-1, d=0;
        ArrayList<Integer> res = new ArrayList();
        while(top<=down && left<=right){
            switch(d){
                case 0:
                    for(int i=left;i<=right;i++){
                        res.add(mat[top][i]);
                    }
                    top++;
                    break;
                case 1:
                    for(int i=top;i<=down;i++){
                        res.add(mat[i][right]);
                    }
                    right--;
                    break;
                case 2:
                    for(int i=right;i>=left;i--){
                        res.add(mat[down][i]);
                    }
                    down--;
                    break;
                case 3:
                    for(int i=down;i>=top;i--){
                        res.add(mat[i][left]);
                    }
                    left++;
                    break;
            }
            if(d==3)
                d=0;
            else 
                d++;
        }
        return res;
    }
}