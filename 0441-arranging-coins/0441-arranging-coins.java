class Solution {
    public int arrangeCoins(int n) {
        long low = 0, high = n;
        while(low <= high)
        {
            long mid = low + (high - low)/2;
            long steps = mid * (mid + 1) / 2;
            if(steps == n)
            {
                return (int)mid;
            }
            else if(steps < n)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return (int)high;
    }
}