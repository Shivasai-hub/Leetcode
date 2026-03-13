class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        int idx=0;
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)==' '|| map.containsKey((key.charAt(i))))
            {
                continue;
            }
            map.put(key.charAt(i),(char)('a'+idx));
            idx++;
        }
        String res="";
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            {
                res=res+" ";
            }
            else
            res = res+map.get(message.charAt(i));
        }
        return res;
    }
}