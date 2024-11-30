class Solution {
    public void reverseArray(int arr[]) {
       int len=arr.length;
       for(int i=0;i<len/2;i++){
           int temp=arr[i];
           arr[i]=arr[len-1-i];
           arr[len-1-i]=temp;
       }
    }
}
