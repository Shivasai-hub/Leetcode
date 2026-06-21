class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        int n = Integer.MIN_VALUE;
        char[] arr = num.toCharArray();
        for(int i = 1; i < arr.length - 1; i++)
        {
            if(arr[i] == arr[i - 1] && arr[i] == arr[i + 1])
            {
                if(n < arr[i] - '0')
                {
                    ans = String.valueOf(arr[i]);
                    n = arr[i] - '0';
                }
            }
        }
        return ans + ans + ans;
    }
}