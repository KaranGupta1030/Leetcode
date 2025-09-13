class Solution {
    public int maxFreqSum(String s) {
       int len=s.length();
        Map<Character,Integer> mp=new HashMap<>();
        int maxv=0;
        int maxc=0;
        for( char ch: s.toCharArray()){
            
                mp.put(ch,mp.getOrDefault(ch,0)+1);    

        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
    char ch = entry.getKey();     // the character
    int freq = entry.getValue();  // its frequency
               if(isVowels(ch)){
                maxv=Math.max(maxv,freq);
            }else{
             maxc=Math.max(maxc,freq);
            }
        }
        return maxc+maxv;
    }

     public boolean isVowels(char ch){
        if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){
            return true;
        }
        return false;
     }
}