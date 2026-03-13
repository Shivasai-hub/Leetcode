class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int temp = 0;
        int[] res = new int[nums.length];
        for(int i = 0;i < nums.length;i++)
        {
            temp = nums[i] % nums.length;
            if(temp < 0)
            {
                temp = nums.length + temp;
            }
            temp = temp + i;
            if(temp >= nums.length)
            {
                temp = temp % nums.length;
            }
            res[i] = nums[temp];
        } 
        return res;
    }
}