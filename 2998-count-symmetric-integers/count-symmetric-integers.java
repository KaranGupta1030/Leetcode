class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int num=low;num<=high;num++){
            String str= Integer.toString(num);
            if(str.length() % 2==0){
                int half= str.length()/ 2;
                int sum1=0;
                int sum2=0;
                for(int i=0;i<half;i++){
                    sum1+= str.charAt(i);
                }
                  for(int i=half;i<str.length();i++){
                    sum2+= str.charAt(i);
                }
                if(sum1==sum2){
                    count++;
                }
                


            }

        }
        return count;
    }
}