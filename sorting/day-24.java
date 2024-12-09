/*
Overlapping Intervals
Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.

Examples:

Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
Output: [[1,4], [6,8], [9,10]]
Explanation: In the given intervals we have only two overlapping intervals here, [1,3] and [2,4] which on merging will become [1,4]. Therefore we will return [[1,4], [6,8], [9,10]].
  */
class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
      List<int[]> ans=new ArrayList();
      Arrays.sort(arr, (a,b)->a[0]-b[0]);
      int str=arr[0][0], end=arr[0][1];
      for(int i=1;i<arr.length;i++){
          if(arr[i][0]<=end){
              end=Math.max(arr[i][1],end);
          }else{
              int [] a= new int[]{str, end};
              ans.add(a);
              str=arr[i][0];
              end=arr[i][1];
          }
      }
        int [] a= new int[]{str, end};
              ans.add(a);
          
      return ans;
    }
}
