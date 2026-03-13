class Solution {
    public void moveZeroes(int[] nums) {
        int x=0;
        for(int num : nums)
        {
            if(num!=0)
            {
                nums[x]=num;
                x++;
            }
        }
        while(x<nums.length)
        {
            nums[x]=0;
            x++;
        }
    }
}