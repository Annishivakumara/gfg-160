/*Search Pattern (KMP-Algorithm)

Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices. 
Note: Return an empty list in case of no occurrences of pattern.

Examples :

Input: txt = "abcab", pat = "ab"
Output: [0, 3]
Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3. 
*/
class Solution {
    void computeLPS(String pat, int[] lps, int M) {
        int j = 0;
        int i = 1;
        lps[0] = 0; // LPS of the first character is always 0

        // Building the LPS array
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1]; // Move j to the previous LPS index
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    ArrayList<Integer> search(String pat, String txt) {
        int N = txt.length();
        int M = pat.length();
        int[] lps = new int[M];
        computeLPS(pat, lps, M);

        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0; // i -> txt index, j -> pat index

        while (i < N) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == M) { // Pattern match found
                res.add(i - j); // Store the 0-based index
                j = lps[j - 1]; // Continue searching for next match
            } else if (i < N && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // Use LPS to skip unnecessary comparisons
                } else {
                    i++; // No match, move to the next character
                }
            }
        }

        return res;
    }
}
