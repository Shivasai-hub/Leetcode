class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n = nums.length;
        Arrays.sort(nums);
        long sum = 0;
        int[] selected = new int[k];
        for(int i = 0; i < k; i++)
        {
            selected[i] = nums[n - k + i];
        }
        int left = 0, right = k - 1;
        while(left <= right)
        {
            if(mul > 1)
            {
                sum += (long)selected[right] * mul;
                right--;
            }
            else
            {
                sum += selected[left];
                left++;
            }
            mul--;
        }
        return sum;
    }
}