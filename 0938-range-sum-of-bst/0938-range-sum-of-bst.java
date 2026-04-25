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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = func(root, low, high);
        return ans;
    }
    public int func(TreeNode root, int low, int high)
    {
        int sum = 0;
        if(root == null)  return sum;
        if(root.val >= low && root.val <= high)
        {
            sum = sum + root.val;
        }
        sum += func(root.left, low, high) + func(root.right, low, high);
        return sum;
    }
}