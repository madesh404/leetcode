import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {
        // hashTable Approach (optimal solution)
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            // check if double exists
            if (seen.contains(2 * num)) {
                return true;
            }
            
            // check if half exists (only if even)
            if (num % 2 == 0 && seen.contains(num / 2)) {
                return true;
            }
            
            seen.add(num);
        }
        
        return false;        
    }
}
