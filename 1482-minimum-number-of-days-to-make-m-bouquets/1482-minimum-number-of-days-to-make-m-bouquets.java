class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length)   return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < bloomDay.length; i++)
        {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }
        int low = mini,high = maxi;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(possible(bloomDay,mid,m,k))
            {
                high = mid - 1;
            }
            else    low = mid + 1;
        }
        return low;
    }
    public boolean possible(int[] arr,int i,int m,int k)
    {
        int cnt = 0,temp = 0;
        for(int j = 0; j< arr.length;j++)
        {
            if(arr[j] <= i)
            {
                cnt++;
            }
            else
            {
                temp += cnt/k;
                cnt = 0;
            }
        }
        temp += cnt/k;
        return temp >= m;
    }
}