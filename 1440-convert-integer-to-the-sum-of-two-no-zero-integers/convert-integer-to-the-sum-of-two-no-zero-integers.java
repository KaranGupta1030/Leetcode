class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr= new int[2];
        for( int i =1;i<=n;i++){
            int rem=n-i;
            if(isNozero(i) && isNozero(rem)){
                arr[0]=i;
                arr[1]=rem;
                return arr;
            }
        }
        return arr;

    }
    public boolean isNozero(int num){
        while(num>0){
            if(num%10==0) {return false;}
            num/=10;
        }
        return true;
    }
}