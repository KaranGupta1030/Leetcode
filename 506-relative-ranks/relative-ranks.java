class Solution {
    public int maxScore(int[] score){
        int max=0;
        for(int element : score){
            max= Math.max(max,element);
        }
        return max;
    }
    public String[] findRelativeRanks(int[] score) {
        int maxVal= maxScore(score);
        int rank=1;
        int[] map = new int[maxVal +1];
         int n= score.length;
         for(int i=0;i<score.length;i++){
            map[score[i]]=i+1;

         }
         String[] res= new String[score.length];
         for(int i=maxVal;i>=0;i--){
            if( map[i] != 0){
                int originalIndex= map[i]-1;
                if(rank==1){
                    res[originalIndex] = "Gold Medal";

                }else if(rank==2){
                    res[originalIndex] = "Silver Medal";

                }else if(rank==3){
                    res[originalIndex] = "Bronze Medal";
                }else{
                    res[originalIndex]= Integer.toString(rank);

                }
                rank++;
            }
            if(rank>score.length) break;

         }
         return res;
       


        
    }
}