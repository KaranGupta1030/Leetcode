class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26]; // to count frequency of chars

        // Count frequency from s
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Subtract frequency from t
        for (char ch : t.toCharArray()) {
            freq[ch - 'a']--;
            if (freq[ch - 'a'] < 0) {
                return false; // t has extra char
            }
        }

        // All should be 0
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}