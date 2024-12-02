/*
Non Repeating Character
Difficulty: EasyAccuracy: 40.43%Submissions: 256K+Points: 2
Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
  */
class Solution {
    public char nonRepeatingChar(String s) {
        // CodeGenius
        int[] freq = new int[26];
        
        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        
        return '$'; // Return '$' if no non-repeating character exists
    }
}
