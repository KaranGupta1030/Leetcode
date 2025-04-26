class Solution {
    public int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area); // Start from the sqrt of area
        while (area % width != 0) { // Decrease width until it divides area
            width--;
        }
        int length = area / width; // Calculate length
        return new int[] {length, width};
    }
}