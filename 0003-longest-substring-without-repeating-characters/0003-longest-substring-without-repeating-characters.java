class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] charIndex = new int[128]; // ASCII characters
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (charIndex[c] > 0) {
                left = Math.max(left, charIndex[c]);
            }

            maxLength = Math.max(maxLength, right - left + 1);

            charIndex[c] = right + 1; // store index (1-based)
        }

        return maxLength;
    }
}