/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.


Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"


Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */

class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0; // first char
        int end = s.length() - 1; // last char

        while (end > start) {
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') { // start is a vowel
                if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U') { // end is a vowel
                    sb.setCharAt(start,ch2); 
                    sb.setCharAt(end, ch1); 
                    start++;
                }
                end--;
            } else { // start is a consonant
                start++;
            }
        }

        return sb.toString();
    }
    public static void main(String[]args) {

        // Case 1
        System.out.println("Expected result: holle");
        System.out.println("Result: " + reverseVowels("hello"));

        System.out.println();

        // Case 2
        System.out.println("Expected result: leotcede");
        System.out.println("Result: " + reverseVowels("leetcode"));
    }

}

