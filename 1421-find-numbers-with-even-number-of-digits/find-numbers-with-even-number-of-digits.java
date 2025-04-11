class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int no: nums){
            if(evenNum(no)){
                count++;
            }
        }
        return count;
        
    }
    boolean evenNum(int num){
        int numdig= digits(num);
        if(numdig % 2==0){
            return true;
        }
        return false;
    }
    int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}