class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                k=i;
                break;
            }
            if(target<nums[i])
            {
                k=i;
                break;
            }
            if(i==nums.length-1)
            {
                k=i+1;
                break;
            }
        }
        return k;
    }
}