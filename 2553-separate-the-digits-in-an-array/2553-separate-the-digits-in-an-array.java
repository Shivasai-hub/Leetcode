class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) 
        {
            String s = String.valueOf(nums[i]);
            for (int j = 0; j < s.length(); j++) 
            {
                list.add(s.charAt(j) - '0');
            }
        }
        int[] arr = new int[list.size()];
        int i = 0;
        for(int num : list)
        {
            arr[i] = num;
            i++;
        }
        return arr;
    }
}