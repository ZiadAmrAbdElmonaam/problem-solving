//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.
//
//
//
//Example 1:
//
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
//Example 2:
//
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//        word1:  a   b
//word2:    p   q   r   s
//merged: a p b q   r   s
//
//

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(length1, length2);

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                str.append(word1.charAt(i));
            }
            if (i < length2) {
                str.append(word2.charAt(i));
            }
        }

        return str.toString();
    }
}
