/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned == null)  return cloned;
        if(target.val == cloned.val)    return cloned;
        TreeNode ans = getTargetCopy(original, cloned.left, target);
        if(ans != null) return ans;
        ans = getTargetCopy(original, cloned.right, target);
        return ans;
    }
}