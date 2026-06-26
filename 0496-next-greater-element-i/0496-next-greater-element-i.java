class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        for(int num : nums2){
            st.push(num);
        }
        for(int i = 0; i < n; i++){
            int el = -1;
            while(!st.isEmpty()){
                if(st.peek() == nums1[i]){
                    break;
                }else if(st.peek() > nums1[i]){
                    el = st.peek();
                }
                st1.push(st.pop());
            }

            while(!st1.isEmpty()){
                st.push(st1.pop());
            }
            
            ans[i] = el;
        }
        return ans;
    }
}