class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            temp[nums[i]]++;
        }
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i] > 1)
            {
                int n = temp[i];
                ans = ans + n*(n - 1)/2;
            }
        }
        return ans;
    }
}