class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        int start;
        for(int i =0; i<nums.length;i++){
            start=nums[i];
            while(i+1<nums.length && nums[i+1]-nums[i] == 1)
            i++;
            if(start!=nums[i]){
                result.add(""+start+"->"+nums[i]);
            }else{
                result.add(""+start);
            }
        }
        return result;
        
    }
}