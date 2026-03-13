class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 1;
        if(nums.length == 0)
        {
            return 0;
        }
        HashSet<Integer> li = new HashSet<>();
        for(int i = 0; i < nums.length;i++)
        {
            li.add(nums[i]);
        }
        for(int it : li)
        {
            if(!li.contains(it - 1))
            {
                int cnt = 1;
                int x = it;
                while(li.contains(x+1))
                {
                    x = x+1;
                    cnt=cnt+1;
                }
                ans= Math.max(ans,cnt);
            }
        }
        return ans;
    }
}