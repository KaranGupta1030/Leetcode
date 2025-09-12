class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st= new HashSet<>();
        for(int n : nums){
            if(st.contains(n)){
                return true;
            }
            st.add(n);
           
        }
        return false;
    
    }
}