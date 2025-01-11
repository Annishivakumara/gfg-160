/*
Longest substring with distinct characters
Given a string s, find the length of the longest substring with all distinct characters. 

Examples:
Input: s = "geeksforgeeks"
Output: 7
Explanation: "eksforg" is the longest substring with all distinct characters.
*/
class Solution {
    public int longestUniqueSubstr(String s) {
        int [] freq= new int[26];
        int i=0, j=0, ans=0;
        while(j<s.length()){
            int ch = s.charAt(j)-'a';
            if(freq[ch]>0){
                ans=Math.max(ans, j-i);
                while(i<j && s.charAt(i)!=s.charAt(j)){
                    freq[s.charAt(i)-'a']=0;
                    i++;
                }
                i++;
            }
            else{
                freq[ch]++;
            }
            j++;
        }
        ans=Math.max(ans, j-i);
        return ans;
        }
}
