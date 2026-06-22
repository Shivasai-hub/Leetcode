class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char c : text.toCharArray())
        {
            freq[c - 'a']++;
        }
        int a = freq[0];
        int b = freq[1];
        int l = freq[11] / 2;
        int o = freq[14] / 2;
        int n = freq[13];
        int temp1 = (a < b) ? a : b;
        int temp2 = (temp1 < l) ? temp1 : l;
        int temp3 = (temp2 < o) ? temp2 : o;
        int ans = (temp3 < n) ? temp3 : n;
        return ans;
    }
}