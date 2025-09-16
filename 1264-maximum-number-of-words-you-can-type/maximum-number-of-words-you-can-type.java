class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int count=0;
     for(String word:words){
        boolean cantype=true;
        for(char ch: brokenLetters.toCharArray()){
            if(word.indexOf(ch)!=-1){
                cantype=false;
                break;
            }
        }
        if(cantype){
            count++;
        }
     }
     return count;
    }
}