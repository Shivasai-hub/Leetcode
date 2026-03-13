class Solution {
    public int minimumDeletions(String s) {
        int cb = 0;
        int del = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'b')
            {
                cb++;
            }
            else
            {
                del = Math.min(del + 1, cb);
            }
        }
        return del;
    }
}