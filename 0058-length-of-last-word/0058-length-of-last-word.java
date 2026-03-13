class Solution {
    public int lengthOfLastWord(String s) {
        String[] act=s.split(" ");
        int k=act.length;
        int res=act[k-1].length();
        return res;
    }
}