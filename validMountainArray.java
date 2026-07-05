class Solution {
    public boolean validMountainArray(int[] arr) {
        // 2 Pointers (optimal solution)
        // O(n) Time Complexity: worst case inspect the entire array once
        // O(1) Space Complexity: only 2 variables created, extra memory stays the same regardless of input size
        int n = arr.length;
        
        if (n < 3) {
            return false;   // edge case: cannot be a valid mountain array if array holds less than 3 elements
        }
        
        int i = 0;
        
        // Walk up mountain
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        
        // Peak can't be first of last
        if (i == 0 || i == n - 1) {
            return false;
        }
        
        // Walk down mountain
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        
        return i == n - 1;
    }
}
