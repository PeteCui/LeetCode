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
    //DFS深度优先遍历，找树的深度
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        int depth = 1 + Math.max(leftDepth, rightDepth);

        return depth;
    }
}
