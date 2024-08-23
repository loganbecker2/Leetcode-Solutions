// Coded on iphone using mobile IDE
// Problem #643
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 1;
        int r = k;
        double maxAverage;
        double sum = 0;
        
        for (int firstSum = 0; firstSum < k; firstSum++) {
            sum += nums[firstSum];
        }
        maxAverage = sum / k;
        while (r < nums.length) {
            sum += nums[r] + (-nums[l-1]);
            //maxAverage = Math.max(maxAverage, sum / k);
            if (maxAverage < sum / k)
                maxAverage = sum / k;
            l++;
            r++;
        }

        return maxAverage;
    }
}
/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 
Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */