class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length+1)/2;
        int s = 0;
        for(int i=0;i<nums.length;i++)
        {
            s = s + nums[i];
        }
        return sum - s;
    }
}