class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length <2){
            return 0;
        }
        Arrays.sort(nums);
        int min=0;

         for(int i=0;i<nums.length-1;i++){
           int diff=nums[i]-nums[i+1];
           int res=Math.abs(diff);
           if(res>min){
            min=res;
           }

         }
         return min;
    }
}