// Brute Force Approach
// For each element in nums (i), loop through rest of array and find if there is another element (j) = target - i
// Time Complexity = O(n^2), nested for loop
// Space Complexity = O(1), space required does not depend on size of input array
class Solution {
public:
    vector<int> twoSum(vector<int> &nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums[j] == target - nums[i]) {
                    return {i, j};
                }
            }
        }
        // Return an empty vector if no solution is found
        return {};
    }
};
