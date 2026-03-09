class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] temp = new int[nums.length-2];
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            temp[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i] == 2)
            {
                ans[j] = i;
                j++;
            }
            if(j==2){
                break;
            }
        }
        return ans;
    }
}