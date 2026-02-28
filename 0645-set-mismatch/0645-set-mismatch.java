class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int s = 0;
        int sn = n * (n + 1) /2;
        int s2 = 0;
        int sn2 = n * (n + 1) * (2 * n + 1) / 6;
        for(int i = 0;i < n;i++)
        {
            s = s + nums[i];
            s2 = s2 + nums[i] * nums[i];
        }
        int val1 = s - sn;
        int val2 = s2 - sn2;
        val2 = val2 / val1;
        int a1 = (val1 + val2) / 2;
        int a2 = a1 - val1;
        int[] ans = new int[2];
        ans[0] = a1;
        ans[1] = a2;
        return ans;
    }
}