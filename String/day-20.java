/*
Strings Rotations of Each Other
You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.

Note: The characters in the strings are in lowercase.

Examples :
Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.
*/
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        s1=s1+s1;
        return s1.lastIndexOf(s2)>=0;
    }
}
