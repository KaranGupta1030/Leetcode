class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1){
            return false;
        }
        if(num==1){
            return true;
        }
        long left=1;
        long right=num;
        while(left<=right){
            long mid=left+(right-left)/2;
            long sq=mid*mid;
            if(sq==num){

           return true;
            }
            else if(sq<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}