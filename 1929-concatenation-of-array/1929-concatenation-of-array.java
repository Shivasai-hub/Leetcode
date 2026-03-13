class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        int k=0;
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                arr[k++]=nums[j];
            }
        }
        return arr;
    }
}