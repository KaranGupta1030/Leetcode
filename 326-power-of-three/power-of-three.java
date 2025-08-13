class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false; // powers of 3 are positive
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}