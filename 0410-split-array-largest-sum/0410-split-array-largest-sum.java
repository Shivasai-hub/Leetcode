class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0 ; i < nums.length;i++)
        {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int temp = countTemp(nums, mid);
            if(temp > k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return low;
    }

    public int countTemp(int[] arr, int limit)
    {
        int split = 1;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum + arr[i] <= limit)
            {
                sum += arr[i];
            }
            else
            {
                split++;
                sum = arr[i];
            }
        }
        return split;
    }
}