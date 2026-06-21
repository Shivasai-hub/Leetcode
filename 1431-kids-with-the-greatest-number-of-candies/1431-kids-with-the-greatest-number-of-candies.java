class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int candy : candies)
        {
            if(candy > maxi)
            {
                maxi = candy;
            }
        }
        for(int candy : candies)
        {
            if(candy + extraCandies >= maxi)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return ans;
    }
}