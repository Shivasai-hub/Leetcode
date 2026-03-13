class Solution {
    public String reversePrefix(String word, char ch) {
        int pos = word.indexOf(ch);
        if(pos == -1)
        {
            return word;
        }
        String str = word.substring(0,pos + 1);
        String rev = new StringBuilder(str).reverse().toString();
        rev = rev + word.substring(pos + 1,word.length());
        return rev;
    }
}