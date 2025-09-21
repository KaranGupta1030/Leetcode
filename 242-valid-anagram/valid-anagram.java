class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> mp = new HashMap<>();

        // Count frequency of chars in s
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // Decrease frequency using chars in t
        for (char ch2 : t.toCharArray()) {
            if (!mp.containsKey(ch2)) {
                return false; // char not in s
            }
            mp.put(ch2, mp.get(ch2) - 1);

            if (mp.get(ch2) < 0) {
                return false; // t has extra char
            }
        }

        // All frequencies should be 0
        for (int val : mp.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}