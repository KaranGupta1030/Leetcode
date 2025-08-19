import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        Set<Integer> st = new HashSet<>();
        
        int i = 0;
        for (int j = 0; j < len; j++) {
            // Maintain window size <= k
            if (j - i > k) {
                st.remove(nums[i]);
                i++;
            }
            
            // If duplicate found within window
            if (st.contains(nums[j])) {
                return true;
            }
            
            st.add(nums[j]);
        }
        
        return false;
    }
}