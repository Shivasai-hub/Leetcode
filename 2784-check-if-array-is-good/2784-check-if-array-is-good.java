class Solution {
    public boolean isGood(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            maxi = Math.max(maxi, nums[i]);
        }
        if(nums.length != maxi + 1)
        {
            return false;
        }
        int[] ans = new int[maxi + 1];
        for(int i = 0; i < nums.length; i++)
        {
            ans[nums[i]]++;
        }
        for(int i = 1; i < ans.length; i++)
        {
            if(i != ans.length - 1 && ans[i] != 1)
            {
                return false;
            }
            if( i == ans.length - 1 && ans[i] != 2)
            {
                return false;
            }
        }
        return true;
    }
}