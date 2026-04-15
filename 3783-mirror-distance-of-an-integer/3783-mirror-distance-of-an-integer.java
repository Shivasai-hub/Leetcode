class Solution {
    public int mirrorDistance(int n) {
        if (n / 10 == 0) return 0;

        String str = String.valueOf(n);
        String s = new StringBuilder(str).reverse().toString();
        int num = Integer.parseInt(s);

        return Math.abs(n - num);
    }
}