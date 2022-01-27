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
class Offer049 {
    //从根节点到叶节点的路径数字之和
    public int sumNumbers(TreeNode root) {
        return fun(root,0);
    }

    public static int fun(TreeNode root, int sum){
        if(root == null)
            return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root. right == null)
            return sum;
        return fun(root.left, sum) + fun(root.right, sum);
    }
}
