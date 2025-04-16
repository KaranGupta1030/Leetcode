import java.util.*;

public class Solution {
    public int minMoves(int[] nums, int k) {
        List<Integer> positions = new ArrayList<>();
        // Step 1: Collect positions of 1s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                positions.add(i);
            }
        }

        int n = positions.size();
        int[] prefix = new int[n + 1];
        // Step 2: Adjust positions and compute prefix sums
        for (int i = 0; i < n; i++) {
            positions.set(i, positions.get(i) - i);
            prefix[i + 1] = prefix[i] + positions.get(i);
        }

        int minMoves = Integer.MAX_VALUE;
        // Step 3: Sliding window to find minimum moves
        for (int i = 0; i <= n - k; i++) {
            int mid = i + k / 2;
            int median = positions.get(mid);
            int left = prefix[mid] - prefix[i];
            int right = prefix[i + k] - prefix[mid + 1];
            int leftCount = mid - i;
            int rightCount = i + k - mid - 1;
            int moves = (median * leftCount - left) + (right - median * rightCount);
            minMoves = Math.min(minMoves, moves);
        }

        return minMoves;
    }
}