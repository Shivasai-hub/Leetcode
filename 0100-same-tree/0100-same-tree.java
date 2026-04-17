/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        preorder(p, list1);
        preorder(q, list2);
        int a1 = list1.size();
        int a2 = list2.size();
        if (a1 != a2)
            return false;
        for (int i = 0; i < a1; i++) {
            Integer x = list1.get(i);
            Integer y = list2.get(i);

            if (x == null && y == null)
                continue;
            if (x == null || y == null)
                return false;
            if (!x.equals(y))
                return false;
        }
        return true;
    }

    public void preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(null);
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}