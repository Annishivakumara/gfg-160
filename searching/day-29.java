class Solution {
    int search(int[] arr, int key) {
      
         int beg = 0, end = arr.length-1;
         while(beg<=end){
             int mid = (beg+end)/2;
             if(arr[mid]==key){
                 return mid;
             }
             if(arr[beg]<=arr[mid]){
                 if(arr[beg]<=key && key< arr[mid]){
                     end=mid-1;
                 }
                 else{
                     beg=mid+1;
                 }
             }
             else {
                 if(arr[mid]<key && key<=arr[end]){
                     beg = mid+1;
                 }
                 else {
                     end = mid -1;
                 }
             }
         }
         return -1;
    }
}
