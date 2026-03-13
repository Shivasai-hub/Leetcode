class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = n*(n+1)/2;
        int s = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%m == 0)
            {
                s = s + i;
            }
        }
        return sum - 2*s;
    }
}