/* 
Next Permutation
Difficulty: MediumAccuracy: 40.66%Submissions: 165K+Points: 4
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically 
next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
*/
import java.util.*;
class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;

        for (int i = n - 1; i >= 1; i--) {
            if (arr[i - 1] < arr[i]) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }

        reverse(arr, index + 1, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
