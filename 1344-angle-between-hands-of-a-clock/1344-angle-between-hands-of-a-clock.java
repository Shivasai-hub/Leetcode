class Solution {
    public double angleClock(int hour, int minutes) {
        double minHand = minutes * 6.0;
        double hoursHand = 30.0 * (hour % 12) + 0.5 * minutes;
        double diff = Math.abs(hoursHand - minHand);
        return Math.min(diff, 360 - diff);
    }
}