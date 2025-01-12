https://raw.githubusercontent.com/yourusername/Elevation-Map-Image/main/image.png
/*
Trapping Rain Water
Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1,
compute how much water can be trapped between the blocks during the rainy season. 

Examples:
Input: arr[] = [3, 0, 1, 0, 4, 0 2]
Output: 10
Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units
*/
class Solution {
    public int maxWater(int arr[]) {
        int ans=0, lmax=0,rmax=0,i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]<=arr[j]){
                if(lmax<arr[i]){
                    lmax=arr[i];
                }else{
                    ans+=lmax-arr[i];
                }
                i++;
            }else{
                if(rmax<arr[j]){
                    rmax=arr[j];
                }else{
                    ans+=rmax-arr[j];
                }
                j--;
            }
        }
        return ans;
    }
}
