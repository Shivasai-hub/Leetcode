class Solution {
    public int fib(int n) {
        if(n == 0)  return 0;
        if(n == 1)  return 1;
        int fib1 = 0, fib2 = 1;
        int fib = 0;
        for(int i = 1; i < n; i++)
        {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }
}