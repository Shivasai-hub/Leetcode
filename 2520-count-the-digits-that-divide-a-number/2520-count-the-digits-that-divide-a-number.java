class Solution {
    public int countDigits(int num) {
        String s = String.valueOf(num);
        int cnt = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(num % (s.charAt(i) - '0') == 0)
            {
                cnt++;
            } 
        }
        return cnt;
    }
}