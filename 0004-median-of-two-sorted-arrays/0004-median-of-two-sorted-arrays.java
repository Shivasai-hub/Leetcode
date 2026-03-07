class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];

        for(int i=0;i<m;i++)
        {
            arr[i] = nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[m+i] = nums2[i];
        }
        Arrays.sort(arr);
        double ans=0;
        if((m + n)%2!=0)
        {
            ans = arr[(m + n)/2];
        }
        else
        {
            int n1 = (m+n)/2-1;
            int n2 = n1+1;
            ans = (double)(arr[n1]+arr[n2])/2;
        }
        return ans;
    }
}