package Medium;
// coded on iphone using mobile IDE
// Problem #209
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0; // left side of window
        // dont need right side as the for loop will act as the right side of the window
        int sum = 0; // track sum of window
        int minNum = nums.length + 1; // large number so if its unchanged we know to return 0 as sum never reaches target
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                if (r-l+1 < minNum)
                    minNum = r-l+1;
                sum -= nums[l];
                l++;
            }
        }
        if (minNum == nums.length+1) //target was never reached
            minNum = 0;

        return minNum;
    }
}
/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 
Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 */