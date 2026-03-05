class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int prod = 1;
        for(int i=0;i<nums.length;i++)
        {
            prod = prod * nums[i];
            pre[i] = prod;
        }
        prod = 1;
        for(int i=nums.length-1;i>=0;i--)
        {
            prod=prod*nums[i];
            suf[i]=prod;
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)    ans[i] = suf[i+1];
            else if(i==nums.length-1)    ans[i]=pre[i-1];
            else
            {
                ans[i] = suf[i+1] * pre[i-1];
            }
        }
        return ans;
    }
}