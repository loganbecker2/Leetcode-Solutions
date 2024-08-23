package Hard;
// Coded on iphone using mobile IDE
// Problem #135
class Solution {
    public int candy(int[] ratings) {
        int length = ratings.length;
        int num = 0;
        int prev = -1; // set to -1 in case of rating 0 on first iteration
        int[] numCandies = new int[length];

        for (int i = 0; i < length;i++) { // traverse array to the right
            if (ratings[i] > prev) { // if the right side neighbor has a larger rating it gets one more than its left neighbor
                if (i == 0) // first kid will be 1. use if to avoid out of bounds index
                    numCandies[i]= 1;
                else
                    numCandies[i] = 1 + numCandies[i-1];
            } else { // else they should get one candy as they aren't larger than the left side neighbor
                numCandies[i] = 1;
            }
            prev = ratings[i];

        }
        prev = ratings[length-1]; // reset prev to last element in arrays candies since we will skip it
        num += numCandies[length - 1]; // We won't look at the last element in the array in the left traversal so add its candies to num now

        for (int i = length - 2; i >=0; i--) { // traverse array to the left and keep track of total candies. -2 because we don't need to look at edge of array as the highest it could be is from right traversal
            if (ratings[i] > prev) {
                if (numCandies[i] <= numCandies[i+1]) {
                    numCandies[i] = 1 + numCandies[i+1];
                }
            }
            num += numCandies[i];
            prev = ratings[i];
        }
        return num;
    }
}

/*
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
 
Constraints:

n == ratings.length
1 <= n <= 2 * 104
0 <= ratings[i] <= 2 * 104
*/