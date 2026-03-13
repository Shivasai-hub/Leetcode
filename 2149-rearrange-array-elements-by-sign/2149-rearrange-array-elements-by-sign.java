class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] a = new int[n/2];
        int[] b = new int[n/2];
        int c=0;
        int d=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                a[c]=nums[i];
                c++;
            }
            else
            {
                b[d]=nums[i];
                d++;
            }
        }
        int e=0;
        for(int i=0;i<n/2;i++)
        {
            nums[e]=a[i];
            e++;
            nums[e]=b[i];
            e++;
        }
        return nums;
    }
}