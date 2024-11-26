class Solution {
    int getMinDiff(int[] arr, int k) {
        int n=arr.length;
       Arrays.sort(arr);
       
       int ans=arr[n-1]-arr[0];
       
       int smallest=arr[0]+k;
       int largest=arr[n-1]-k;
       int minimum=0,maximum=0;
       for (int i=0;i<n-1;i++){
           minimum=Math.min(smallest,arr[i+1]-k);
           maximum=Math.max(largest,arr[i]+k);
           if(minimum<0){
               continue;
           }
           ans=Math.min(ans,maximum-minimum);
       }
       return ans;
    }
}
