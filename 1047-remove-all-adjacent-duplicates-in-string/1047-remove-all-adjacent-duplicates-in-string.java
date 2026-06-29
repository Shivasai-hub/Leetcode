class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for(char ch : c)
        {
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else if(ch == st.peek())
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        String ans = "";
        for(char temp : st)
        {
            ans += String.valueOf(temp);
        }
        return ans;
    }
}