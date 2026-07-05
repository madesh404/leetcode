class Solution {
    public void duplicateZeros(int[] arr) {
        // Two Pointers (optimal solution)
        // O(n) Time Complexity
        int zeros = 0;
        int n = arr.length;
        
        // Count zeros to determine virtual size of array
        for (int num : arr) {
            if (num == 0) zeros++;
        }
        
        // Define two pointers, i for original array index, j for virtual array index
        for (int i = n - 1, j = n + zeros - 1; i >= 0; i--, j--) {

            // Write into array only if within bounds
            if (j < n) {
                arr[j] = arr[i];
            }

            // Handle duplicate zero write
            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }
        }
    }
}
