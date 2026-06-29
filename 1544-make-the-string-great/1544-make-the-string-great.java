class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for(char ch : c)
        {
            if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32)
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