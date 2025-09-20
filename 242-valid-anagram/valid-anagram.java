class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray() ){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch2:t.toCharArray()){
            if(mp.containsKey(ch2)){
                mp.put(ch2,mp.get(ch2)-1);
            }
        }
        
        for(int i:mp.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
        
    }
}