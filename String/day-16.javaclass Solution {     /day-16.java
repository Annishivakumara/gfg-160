/*Anagram
Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

Note: You can assume both the strings s1 & s2 are non-empty.

Examples :

Input: s1 = "geeks", s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
  */
class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        char c1[]=s1.toCharArray();
        char c2[]= s2.toCharArray();
        if(c1.length!=c2.length){
            return false;
        }
    Arrays.sort(c1);
    Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i] != c2[i]){
                return false;
            }
           
        }
        return true;
    }
}
