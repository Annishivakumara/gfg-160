class Solution {
    public String addBinary(String s1, String s2) {
        int i = s1.length() - 1, j = s2.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int cursum = carry;
            cursum += i >= 0 ? s1.charAt(i) - '0' : 0;
            cursum += j >= 0 ? s2.charAt(j) - '0' : 0;

            sb.append(cursum % 2); // Append the current binary digit
            carry = cursum / 2;    // Update the carry for the next iteration

            i--; // Decrement i
            j--; // Decrement j
        }

        sb.reverse(); // Reverse the result to get the final binary string

        // Remove leading zeroes
        int k = 0;
        while (k < sb.length() && sb.charAt(k) == '0') {
            k++;
        }

        return k == sb.length() ? "0" : sb.substring(k); // Return "0" if the result is all zeroes
    }
}
