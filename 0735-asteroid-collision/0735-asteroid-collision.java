class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int num : asteroids)
        {
            boolean des = false;
            while(!stack.isEmpty() && stack.peek() > 0 && num < 0)
            {
                if(stack.peek() < -num)
                {
                    stack.pop();
                }
                else if(stack.peek() == -num)
                {
                    stack.pop();
                    des = true;
                    break;
                }
                else
                {
                    des = true;
                    break;
                }
            }
            if(!des)
            {
                stack.push(num);
            }
        }
        int[] arr = new int[stack.size()];
        for(int i = arr.length - 1; i >= 0; i--)
        {
            arr[i] = stack.pop();
        }
        return arr;
    }
}