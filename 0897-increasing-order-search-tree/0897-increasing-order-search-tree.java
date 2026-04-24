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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return buildTree(list);
    }
    public void inorder(TreeNode root, List<Integer> list)
    {
        if(root == null)    return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public TreeNode buildTree(List<Integer> list)
    {
        TreeNode dummy = new TreeNode(-1);
        TreeNode cur = dummy;
        for(int val : list)
        {
            cur.right = new TreeNode(val);
            cur = cur.right;
        }
        return dummy.right;
    }
}