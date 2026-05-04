class Solution {
    public int totalMoney(int n) {
        int k = n / 7;
        int r = n % 7;
        int fullWeeks = 7 * (k * (k + 1) / 2) + 21 * k;
        int remaining = r * (k + 1) + (r * (r - 1)) / 2;
        return fullWeeks + remaining;
    }
}