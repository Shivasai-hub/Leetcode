class Solution {
    public int findClosest(int x, int y, int z) {
        int a1 = Math.abs(x - z);
        int a2 = Math.abs(y - z);
        if(a1 > a2)
        {
            return 2;
        }
        else if(a2 > a1)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}