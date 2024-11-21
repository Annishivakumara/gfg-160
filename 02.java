//                                                 #Move All Zeroes to End
class Solution {
    // Function to push all zeros to the end
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;

        // Create a temporary array to store the non-zero elements
        int[] temp = new int[n];

        // Pointer to keep track of index in temp[]
        int j = 0;

        // Copy non-zero elements to temp[]
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }

        // Fill the remaining positions in temp[] with zeros
        while (j < n) {
            temp[j++] = 0;
        }

        // Copy the elements back from temp[] to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
