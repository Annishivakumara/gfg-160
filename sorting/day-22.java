/*
Find H-Index
Given an integer array citations[], where citations[i] is the number of citations a researcher received for the ith paper. The task is to find the H-index.
H-Index is the largest value such that the researcher has at least H papers that have been cited at least H times.
Examples:
Input: citations[] = [3, 0, 5, 3, 0]
Output: 3
Explanation: There are at least 3 papers (3, 5, 3) with at least 3 citations.
  */
class Solution {
    public int hIndex(int[] citations) {
        // CodeGenius
        int n = citations.length;
        int[] freq = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n) {
                freq[n]++;
            } else {
                freq[citations[i]]++;
            }
        }
        int Hindex = n;
        int num = freq[n];
        while (num < Hindex) {
            Hindex--;
            num += freq[Hindex];
        }
        return Hindex;
    }
}
