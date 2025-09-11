class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        int cand=0;
        int pts=0;
        for(int i =0;i<nums.length;i++){
            if(pts==0){
                cand=nums[i];
            }
            if(cand==nums[i]){
                pts++;
            }
            else{
                pts--;
            }
        }
        return cand;
        
    }
}