class Solution {
    public int reverse(int x) {
        int rev=0,rem=0;
        int temp=x;
        if(x<0)
        {
            x=-x;
        }
        while(x!=0)
        {
            rem=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && rem>7)
            {
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && rem<-8)
            {
                return 0;
            }
            x/=10;
            rev=rev*10+rem;
        }
        if(temp<0)
        {
            return -rev;
        }
        return rev;
    }
}