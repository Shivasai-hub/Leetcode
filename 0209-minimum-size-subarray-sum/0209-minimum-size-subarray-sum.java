class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int j = 0;
        int mini = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            while(sum >= target)
            {
                mini = Math.min(mini,i-j+1);
                sum = sum - nums[j];
                j++;
            }
        }
        return mini == Integer.MAX_VALUE?0:mini;
    }
}