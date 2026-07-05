class Solution {
    public int[] sortedSquares(int[] nums) {
        // Two Pointers (optimal solution)
        //  O(n) Time Complexity
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0;  
        int right = n - 1;
        int pos = n - 1;
        
        while (left <= right) {
            int leftSq = nums[left] * nums[left];  // sqaure current left pointer element
            int rightSq = nums[right] * nums[right];  // square current right pointer element
            
            // compare sqaures and fill result from the end 
            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }
        return result;
    }
}
