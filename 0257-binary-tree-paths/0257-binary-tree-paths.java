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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        String s = "";
        return toCreate(root, list, s);
    }
    private List<String> toCreate(TreeNode root, List<String> list, String s)
    {
        if(root == null)    return list;
        if(root.left == null && root.right == null)
        {
            s += String.valueOf(root.val);
            list.add(s);
            return list;
        }
        else
        {
            s += String.valueOf(root.val);
            s += "->";
        }
        list = toCreate(root.left, list, s);
        list = toCreate(root.right, list, s);
        return list;
    }
}