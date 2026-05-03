class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String temp = s;
        int n = s.length();
        String s1 = String.valueOf(s.charAt(0));
        String s2 = s.substring(1, n);
        String now = s2 + s1;
        if(now.equals(goal))    return true;
        for(int i = 1 ; i < s.length(); i++)
        {
            String s3 = String.valueOf(now.charAt(0));
            String s4 = now.substring(1, n);
            now = s4 + s3;
            if(now.equals(goal))    return true;
        }
        return false;
    }
}