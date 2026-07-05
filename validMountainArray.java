class Solution {
    public boolean validMountainArray(int[] arr) {
        
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
