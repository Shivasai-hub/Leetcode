int lengthOfLongestSubstring(char* s) {
     int n = strlen(s);
    int charIndex[128] = {0}; // Stores last seen index of characters
    int maxLength = 0;
    int left = 0; // Left boundary of the window

    for (int right = 0; right < n; right++) {
        if (charIndex[s[right]] > 0) {
            left = (left > charIndex[s[right]]) ? left : charIndex[s[right]];
        }
        
        maxLength = (maxLength > (right - left + 1)) ? maxLength : (right - left + 1);
        charIndex[s[right]] = right + 1; // Store index (1-based to avoid zero conflict)
    }

    return maxLength;
    
}