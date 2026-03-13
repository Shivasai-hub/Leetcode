class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int k = 0;
        for(int i = 0;i <= nums.size()-2;i++)
        {
            for(int j = i+1;j <= nums.size()-1;j++)
            {
                if(nums.get(i) + nums.get(j) < target)
                {
                    k++;
                }
            }
        }
        return k;
    }
}