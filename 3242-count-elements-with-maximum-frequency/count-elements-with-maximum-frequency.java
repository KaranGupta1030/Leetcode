class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int maxFreq=0;
        int count=0;

        for(int values:mp.values()){
            if(values>maxFreq){
                maxFreq=values;
            }
        }
    for(int values:mp.values()){
            if(values==maxFreq){
                count+=maxFreq;
            }
        }
        return count;
    
        
    }
}