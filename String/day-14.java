/*
Implement Atoi
Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.
Cases for atoi() conversion:

Skip any leading whitespaces.
Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.
Examples:

Input: s = "-123"
Output: -123
Explanation: It is possible to convert -123 into an integer so we returned in the form of an integer
*/
class Solution {
    public int myAtoi(String s) {
        if(s==null){
             return 0;
         }
         s=s.trim();
        if(s.length()==0){
            return 0;
        }
        int sign= +1;
        long ans=0;
        
        if(s.charAt(0)=='-'){
        sign=-1;
        }
        int MAX=Integer.MAX_VALUE;
        int MIN=Integer.MIN_VALUE;
        
        int i=(s.charAt(0)=='+' || s.charAt(0)=='-')?1:0;
        while(i<s.length()){
            if(s.charAt(i)==' '|| !Character.isDigit(s.charAt(i))){
                break;
            }
            ans=ans*10 +s.charAt(i)-'0';
            if(sign==-1 && -1*ans<MIN){
                return MIN;
            }
            if(sign==1 && ans>MAX){
                return MAX;
            }
                i++;
            }
            return (int)(sign*ans);
    }
}
