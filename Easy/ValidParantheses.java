// Problem #20

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{'
            || s.charAt(i) ==  '[') {
                stck.push(s.charAt(i));
            } else {
                if (stck.empty()) {
                    return false;
                } else if (s.charAt(i) == ')' && stck.peek() == '(') {
                stck.pop();
                } else if (s.charAt(i) == '}' && stck.peek() == '{') {
                    stck.pop();
                } else if (s.charAt(i) == ']' && stck.peek() == '[') {
                    stck.pop();
                } else {
                    return false;
                }
    
            }
        }
    return stck.empty();
    }
}

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

  */
