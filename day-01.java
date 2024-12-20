/*Second Largest
Given an array of positive integers arr[], return the second largest element from the array.
If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.

Examples:
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
    */
class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return -1; 
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;    
            } else if (num > second && num != first) {
                second = num;   
            }
        }
    
     if (second == Integer.MIN_VALUE) { 
            return -1;
        } else {
            return second; 
        }
    }
}
