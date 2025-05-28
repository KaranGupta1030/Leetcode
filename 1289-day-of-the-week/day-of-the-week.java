class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Month offset values as per Zeller's Congruence
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        // Adjust year if month is Jan or Feb
        if (month < 3) {
            year -= 1;
        }

        int weekNo = (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;

        return weekDays[weekNo];
    }
}