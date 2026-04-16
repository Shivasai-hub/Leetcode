class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int type = 0;
        String a = "type";
        String b = "color";
        String c = "name";
        if(ruleKey.equals(a))   type = 0;
        else if(ruleKey.equals(b))  type = 1;
        else    type = 2;
        for(List<String> str : items)
        {
            if(str.get(type).equals(ruleValue))
            {
                ans++;
            }
        }
        return ans;
    }
}