class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        for(String s : operations)
        {
            if(s.equals("C"))
            {
                stack.pop();
            }
            else if(s.equals("D"))
            {
                int temp = Integer.parseInt(stack.peek());
                String str = String.valueOf(temp * 2);
                stack.push(str);
            }
            else if(s.equals("+"))
            {
                int a1 = Integer.parseInt(stack.pop());
                int a2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a2));
                stack.push(String.valueOf(a1));
                String temp = String.valueOf(a1 + a2);
                stack.push(temp);
            }
            else
            {
                stack.push(s);
            }
        }
        int ans = 0;
        for(String s : stack)
        {
            ans += Integer.parseInt(s);
        }
        return ans;
    }
}