class Solution {
    public int scoreOfString(String s) {
        int i = 0;
        int sum = 0;
        for(int j = i+1;j<=s.length()-1;j++)
        {
            sum += Math.abs((int)s.charAt(i) - (int)s.charAt(j));
            i++;
        }
        return sum;
    }
}