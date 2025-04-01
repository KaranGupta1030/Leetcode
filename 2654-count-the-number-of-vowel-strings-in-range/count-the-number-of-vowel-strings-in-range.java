class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;

        for(int i=left;i<=right;i++){
            if(checkVowels(words[i])){
                count ++;

            }
        }
        return count;
        
    }
    private static boolean checkVowels(String str){
        int n=str.length();
        if(str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u'){
            if(str.charAt(n-1)=='a'||str.charAt(n-1)=='e'||str.charAt(n-1)=='i'||str.charAt(n-1)=='o'||str.charAt(n-1)=='u'){
                return true;

            }
        }
        return false;
    }
}