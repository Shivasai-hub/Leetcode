class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freq_target = new int[26];
        int[] freq_s = new int[26];
        for(char c : target.toCharArray())
        {
            freq_target[c - 'a']++;
        }
        for(char c : s.toCharArray())
        {
            freq_s[c - 'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++)
        {
            if(freq_target[i] > 0)
            {
                ans = Math.min(ans, freq_s[i] / freq_target[i]);
            }
        }
        return ans;
    }
}