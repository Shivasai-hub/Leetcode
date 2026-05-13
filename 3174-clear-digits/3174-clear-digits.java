class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        for(char ch : stack)
        {
            str.append(ch);
        }
        return str.toString();
    }
}