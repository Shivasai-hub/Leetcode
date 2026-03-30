class Solution {
    public boolean checkStrings(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        HashMap<Character,Integer> e1 = new HashMap<>();
        for(int i = 0;i<s1.length();i+=2)
        {
            e1.put(a1[i],e1.getOrDefault(a1[i],0)+1);
        }
        HashMap<Character,Integer> e2 = new HashMap<>();
        for(int i=0;i<s2.length();i+=2)
        {
            e2.put(a2[i],e2.getOrDefault(a2[i],0)+1);
        }
        boolean ans1 = e1.equals(e2);
        if(ans1 == false)
        {
            return false;
        }
        HashMap<Character,Integer> o1 = new HashMap<>();
        for(int i=1;i<s1.length();i+=2)
        {
            o1.put(a1[i],o1.getOrDefault(a1[i],0)+1);
        }
        HashMap<Character,Integer> o2 = new HashMap<>();
        for(int i=1;i<s2.length();i+=2)
        {
            o2.put(a2[i],o2.getOrDefault(a2[i],0)+1);
        }
        return o1.equals(o2);
    }
}