// coded on iphone using mobile IDE
// Problem #125
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0; // first element
        int j = s.length() - 1; // last element

        while (i < j) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);
            if (!Character.isLetterOrDigit(ch1)) {
				i++;
			} else if (!Character.isLetterOrDigit(ch2)) {
                j--;
            } else {
                if (Character.isLetter(ch1))
                    ch1 = Character.toLowerCase(ch1);
                if (Character.isLetter(ch2))
                    ch2 = Character.toLowerCase(ch2);
                if (ch1 != ch2)
                    return false;
                i++;
                j--;
            }
        }




        return true;
    }
}

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 
Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters. 
*/