class Solution {
    public boolean isSelfDividing(int num){
        int n = num;
        while(num>0){
            int remainder= num %10;
            num= num/10;
            if(remainder==0 || n% remainder !=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> list= new ArrayList<>();
      for(int i = left;i<=right;i++){
        if(isSelfDividing(i)){
            list.add(i);
        }
      }
      return list;
        
    }
}