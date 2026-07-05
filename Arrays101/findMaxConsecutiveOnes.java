class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;  // current streak of 1s
        int max = 0;    // maximum streak found
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}
