class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            high = Math.max(high, nums[i]);
        }
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(sumByD(nums,mid) <= threshold)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    public int sumByD(int[] arr, int div)
    {
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            sum += Math.ceil((double)(arr[i])/(double)(div));
        }
        return sum;
    }
}