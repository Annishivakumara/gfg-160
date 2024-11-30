class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction
    public void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d >= n
        reverse(arr, 0, d - 1);       // Reverse the first d elements
        reverse(arr, d, n - 1);       // Reverse the remaining elements
        reverse(arr, 0, n - 1);       // Reverse the entire array
    }

    // Helper function to reverse a portion of the array
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
