class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; // index for placing valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i]; // keep the element
                j++;
            }
        }
        return j; // new length of array without val
    }
}