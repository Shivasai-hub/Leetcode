class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < n; i++)
        {
            oddSum += i * 2 + 1;
            evenSum += i * 2 + 2;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
        return gcd(oddSum, evenSum);
    }
    private int gcd(int a, int b)
    {
        int ans = 0;
        for(int i = 1; i <= Math.min(a, b); i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                ans = i;
            }
        }
        return ans;
    }
}