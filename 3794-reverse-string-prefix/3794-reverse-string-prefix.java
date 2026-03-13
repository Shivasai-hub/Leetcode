class Solution {
    public String reversePrefix(String s, int k) {
        String str = s.substring(0,k);
        String rev = new StringBuilder(str).reverse().toString();
        rev = rev + s.substring(k,s.length());
        return rev;
    }
}