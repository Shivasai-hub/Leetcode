class Solution {
    public int arrangeCoins(int n) {
        long sum = 0;
        int cnt = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += i;
            cnt++;
            if(sum > n) return cnt - 1;
            if(sum == n)    return cnt;
        }
        return cnt;
    }
}