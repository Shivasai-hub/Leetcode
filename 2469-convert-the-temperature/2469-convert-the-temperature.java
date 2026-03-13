class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        double a1 = celsius + 273.15000;
        double a2 = celsius * 1.80000 + 32.00000;
        ans[0] = a1;
        ans[1] = a2;
        return ans;
    }
}