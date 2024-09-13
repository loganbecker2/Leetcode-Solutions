package Medium;
// Problem # 633
class Solution {
    public boolean judgeSquareSum(int c) {
        long r = (long)Math.sqrt(c);
        long l = 0;
        long sum;
        while (r >= l) {
            sum = r*r + l*l;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                r--;
            } else {
                l++;    
            }
        }
        return false;
    }
}

/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
 

Constraints:

0 <= c <= 231 - 1
 */