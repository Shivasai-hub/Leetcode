class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int mon = Integer.parseInt(date.substring(5,7));
        int dat = Integer.parseInt(date.substring(8,10));
        String y = Integer.toBinaryString(year);
        String m = Integer.toBinaryString(mon);
        String d = Integer.toBinaryString(dat);
        String ans = "";
        ans = ans + y;
        ans = ans + "-";
        ans = ans + m;
        ans = ans + "-";
        ans = ans + d;
        return ans;
    }
}