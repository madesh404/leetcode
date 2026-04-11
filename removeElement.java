class Solution {
    public int removeElement(int[] nums, int val) {
        // Two pointers, swap with end
        int i = 0;
        int n = nums.length;
        
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];  // move the element to be removed to the end of the array
                n--;
            } else {
                i++;
            }
        }
        return n;   // size of the valid portion of the array 
    }
}
