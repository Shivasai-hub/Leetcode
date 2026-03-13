class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int c1=0,c2=0;
        int e1=Integer.MIN_VALUE, e2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(c1==0 && nums[i]!=e2)
            {
                c1++;
                e1=nums[i];
            }
            else if(c2 ==0 && nums[i]!=e1)
            {
                c2++;
                e2=nums[i];
            }
            else if(nums[i] == e1)
            {
                c1++;
            }
            else if(nums[i] == e2)
            {
                c2++;
            }
            else{
                c1--;
                c2--;
            }
            
        
        }
        int cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==e1)
            {
                cnt1++;
            }
            if(nums[i]==e2)
            {
                cnt2++;
            }
        }
        if(cnt1>nums.length/3)
        {
            list.add(e1);
        }
        if(cnt2>nums.length/3)
        {
            list.add(e2);
        }
        return list;
    }
}