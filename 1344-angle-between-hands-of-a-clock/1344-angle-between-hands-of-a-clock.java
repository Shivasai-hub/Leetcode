class Solution {
    public double angleClock(int hour, int minutes) {
        double hoursHand = minutes * 6.0;
        double minHand = 30.0 * (hour % 12) + 0.5 * minutes;
        double diff = Math.abs(hoursHand - minHand);
        return Math.min(diff, 360 - diff);
    }
}