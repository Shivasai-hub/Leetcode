class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mini = Integer.MIN_VALUE;
        int maxi = 0;
        for(int i=0;i<weights.length;i++)
        {
            mini = Math.max(mini,weights[i]);
            maxi += weights[i];
        }
        int low = mini,high = maxi;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int noOfDays = findDays(weights, mid);
            if(noOfDays <= days)
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
    public int findDays(int[] arr, int cap)
    {
        int days = 1, load = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] + load > cap)
            {
                days++;
                load = arr[i];
            }
            else
            {
                load += arr[i];
            }
        }
        return days;
    }
}