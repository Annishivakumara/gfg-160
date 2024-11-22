/*
Move All Zeroes to End
Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements.
Do the mentioned change in the array in place.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
 */
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }
        while (j < n) {
            temp[j++] = 0;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
