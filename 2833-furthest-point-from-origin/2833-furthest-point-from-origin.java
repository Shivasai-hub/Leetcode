class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int s = 0;
        for(int i = 0; i < moves.length(); i++)
        {
            if(moves.charAt(i) == 'L')
            {
                l++;
            }
            else if(moves.charAt(i) == 'R')
            {
                r++;
            }
            else
            {
                s++;
            }
        }
        return Math.max(l, r) + s - Math.min(l, r);
    }
}