class Solution {
    public boolean isHappy(int n) {
        Set<Integer> list = new HashSet<>();
        while(!list.contains(n)){
            list.add(n);
            int sum=0;
            while(n!=0){
                int rem = n%10;
                sum+= rem*rem;
                n=n/10;
            }
            n=sum;
        }
        return n==1;
        
    }
}