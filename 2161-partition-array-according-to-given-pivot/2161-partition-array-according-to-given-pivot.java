class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] < pivot)
            {
                l1.add(nums[i]);
            }
            else if(nums[i] == pivot)
            {
                l2.add(nums[i]);
            }
            else
            {
                l3.add(nums[i]);
            }
        }
        int[] arr = new int[nums.length];
        int i = 0;
        for(int l : l1)
        {
            arr[i] = l;
            i++;
        }
        for(int l : l2)
        {
            arr[i] = l;
            i++;
        }
        for(int l : l3)
        {
            arr[i] = l;
            i++;
        }
        return arr;
    }
}