/*
Find All Triplets with Zero Sum

Given an array arr[], find all possible triplets i, j, k in the arr[] whose sum of elements is equals to zero. 
Returned triplet should also be internally sorted i.e. i<j<k.

Examples:

Input: arr[] = [0, -1, 2, -3, 1]
Output: [[0, 1, 4], [2, 3, 4]]
Explanation: Triplets with sum 0 are:
arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
*/
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        Set<List<Integer>> ansSet = new HashSet();
        Map<Integer, List<int[]>> mp =new HashMap();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(!mp.containsKey(sum))
                {
                    mp.put(sum, new ArrayList<>());
                }
                mp.get(sum).add(new int[]{i,j});
            }
        }
        
        for(int i=0;i<arr.length;i++){
            int tar = -arr[i];
            if(mp.containsKey(tar)){
                List<int[]> pairs = mp.get(tar);
                for(int[] pair: pairs){
                    if(pair[0]!=i && pair[1]!=i){
                        List<Integer> curr = Arrays.asList(i, pair[0], pair[1]);
                        Collections.sort(curr);
                        ansSet.add(curr);
                    }
                }
            }
        }
        return new ArrayList<>(ansSet);
    }
}
