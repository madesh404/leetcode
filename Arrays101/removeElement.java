class Solution {
    public int removeElement(int[] nums, int val) {
        // Overwrite with wanted elements (optimal solution)
        int k = 0;
        
        // Consider elements to be removed as non-existent
        // In a single pass copy the visible elements in-place
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
