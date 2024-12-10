/*
Non-overlapping Intervals
Difficulty: MediumAccuracy: 51.92%Submissions: 25K+Points: 4
Given a 2D array intervals[][] of representing intervals where intervals [i] = [starti, endi ]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Examples:

Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
Output: 1
Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.
*/

class Solution {
    static int minRemoval(int intervals[][]) {
      Arrays.sort(intervals,(a,b)->a[1]-b[1]);
      int end=intervals[0][1],cn=1;
      for(int i=1;i<intervals.length;i++){
          if(intervals[i][0]>=end){
              cn++;
              end=intervals[i][1];
              
          }
      }
      return intervals.length-cn;
    }
}
