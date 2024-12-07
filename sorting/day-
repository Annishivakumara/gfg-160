/*
Count Inversions

Given an array of integers arr[]. Find the Inversion Count in the array.
Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
*/
class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
       return margesort(arr,0,arr.length-1);
    }
    static int margesort(int arr[], int low, int high){
        if(low>=high){
            return 0;
        }
        int mid=(low+high)/2;
        int leftinversion=  margesort(arr, low ,mid);
        int rightinversion=  margesort(arr,mid+1,high);
        int m=marge(arr,low,mid,high);
        return leftinversion+rightinversion+m;
    }
    static int marge(int [] arr, int low, int mid, int high){
        int j=mid+1;
        int cn=0;
        for(int i=low;i<=mid;i++){
            while(j<=high && arr[i]>arr[j]){
                j++;
            }
            cn+=j-(mid+1);
        }
        Arrays.sort(arr,low,high+1);
        return cn;
    }
    
}
