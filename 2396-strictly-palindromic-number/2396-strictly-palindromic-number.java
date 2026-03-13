class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int y=n;
        for(int i=2;i<=y-2;i++)
        {
            int j=0;
            while(n>0)
            {
                j=j*10+n%i;
                n=n/i;
            }
            String s=Integer.toString(j);
            String r = new StringBuilder(s).reverse().toString();
            if( s == r)
            {
                return true;
            }
        }
        return false;
        
    }
}