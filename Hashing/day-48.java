/*
  Print Anagrams Together
Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their appearance in the original array. Look at the sample case for clarification.

Note: The final output will be in lexicographic order.

Examples:

Input: arr[] = ["act", "god", "cat", "dog", "tac"]
Output: [["act", "cat", "tac"], ["god", "dog"]]
Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
*/

class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String, List<String>> mp = new HashMap();
        
        for(String s: arr){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortWord = String.valueOf(ch);
            
            if(!mp.containsKey(sortWord)){
                mp.put(sortWord, new ArrayList());
            }
            mp.get(sortWord).add(s);
        }
        return new ArrayList(mp.values());
    }
}
