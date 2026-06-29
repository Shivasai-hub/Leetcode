class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> s = new ArrayList<>();
        int curr = 1;
        int idx = 0;
        while(idx < target.length)
        {
            s.add("Push");
            if(curr == target[idx])
            {
                idx++;
            }
            else
            {
                s.add("Pop");
            }
            curr++;
        }
        return s;
    }
}