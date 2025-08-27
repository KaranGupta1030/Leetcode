import java.util.HashSet;

class Solution {
    public boolean checkIfPangram(String sentence) {
        // If less than 26 letters, can't be pangram
        if(sentence.length() < 26){
            return false;
        }

        // Use a HashSet to store unique characters
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < sentence.length(); i++){
            set.add(sentence.charAt(i));
        }

        // Pangram must have 26 letters
        return set.size() == 26;
    }
}