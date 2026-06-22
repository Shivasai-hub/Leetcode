class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[][] arr = new int[score.length][2];
        for(int i = 0; i < score.length; i++)
        {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
        String[] ans = new String[score.length];
        for(int i = 0; i < score.length; i++)
        {
            int id = arr[i][1];
            if(i == 0)
            {
                ans[id] = "Gold Medal";
            }
            else if(i == 1)
            {
                ans[id] = "Silver Medal";
            }
            else if(i == 2)
            {
                ans[id] = "Bronze Medal";
            }
            else
            {
                ans[id] = String.valueOf(i + 1);
            }
        }
        return ans;
    }
}