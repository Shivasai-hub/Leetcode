class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String op : tokens)
        {
            if(op.equals("+"))
            {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                String temp = String.valueOf(a + b);
                st.push(temp);
            }
            else if(op.equals("-"))
            {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                String temp = String.valueOf(b - a);
                st.push(temp);
            }
            else if(op.equals("*"))
            {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                String temp = String.valueOf(a * b);
                st.push(temp);
            }
            else if(op.equals("/"))
            {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                String temp = String.valueOf(b / a);
                st.push(temp);
            }
            else
            {
                st.push(op);
            }
        }
        return Integer.parseInt(st.peek());
    }
}