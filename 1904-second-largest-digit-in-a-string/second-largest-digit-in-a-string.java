class Solution {
    public int secondHighest(String s) {
       
   
        int max1 = -1; // largest digit
        int max2 = -1; // second largest

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit > max1) {
                    max2 = max1;
                    max1 = digit;
                } else if (digit > max2 && digit < max1) {
                    max2 = digit;
                }
            }
        }

        return max2; // returns -1 if no second largest digit found
    
    }
}