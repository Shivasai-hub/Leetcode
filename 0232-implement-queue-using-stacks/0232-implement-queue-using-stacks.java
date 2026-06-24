class MyQueue {
    Stack<Integer> stack;
    public MyQueue() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Stack<Integer> stack2 = new Stack<>();
        int a = stack.size();
        for(int i = 0; i < a; i++)
        {
            stack2.push(stack.pop());
        }
        int b = stack2.pop();
        int c = stack2.size();
        for(int i = 0; i < c; i++)
        {
            stack.push(stack2.pop());
        }
        return b;
    }
    
    public int peek() {
        Stack<Integer> stack2 = new Stack<>();
        int a = stack.size();
        for(int i = 0; i < a; i++)
        {
            stack2.push(stack.pop());
        }
        int b = stack2.peek();
        for(int i = 0; i < a; i++)
        {
            stack.push(stack2.pop());
        }
        return b;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */