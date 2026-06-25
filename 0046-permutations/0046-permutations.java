class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, current, visited, ans);
        return ans;
    } 

    private void backtrack(int[] nums, List<Integer> current, boolean[] visited, List<List<Integer>> ans)
    {
        if(current.size() == nums.length)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(visited[i])
            {
                continue;
            }
            visited[i] = true;
            current.add(nums[i]);
            backtrack(nums, current, visited, ans);
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}