class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int preSum =1, sufSum = 1;
        for(int i = 0; i < nums.length; i++){
            if(preSum == 0) preSum = 1;
            if(sufSum == 0) sufSum = 1;
            preSum = preSum * nums[i];
            sufSum = sufSum * nums[nums.length - i -1];
            ans = Math.max(ans, Math.max(preSum, sufSum));
        }
        return ans;            
    }
}