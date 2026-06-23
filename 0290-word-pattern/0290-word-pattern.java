class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length)    return false;
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        char[] arr = pattern.toCharArray();
        for(int i = 0; i < pattern.length(); i++)
        {
            if(map1.containsKey(arr[i]))
            {
                if(!map1.get(arr[i]).equals(words[i]))
                {
                    return false;
                }
            }
            if(map2.containsKey(words[i]))
            {
                if(map2.get(words[i]) != arr[i])
                {
                    return false;
                }
            }
            map1.put(arr[i], words[i]);
            map2.put(words[i], arr[i]);
        }
        return true;
    }
}