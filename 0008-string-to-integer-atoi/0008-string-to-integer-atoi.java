class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        String ans = "";
        boolean minus = false;
        int i = 0;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            minus = (s.charAt(i) == '-');
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            ans += s.charAt(i);
            i++;
        }
        if (ans.length() == 0) return 0;
        try {
            int num = Integer.parseInt(ans);
            return minus ? -num : num;
        } catch (Exception e) {
            return minus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}