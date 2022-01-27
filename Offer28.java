public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isEquals(root.left, root.right);
    }

    private boolean isEquals(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        //we should compare root1.left with root2.right and root1.right with root2.left 
        return root1.val == root2.val && isEquals(root1.right, root2.left) && isEquals(root1.left, root2.right);
    }
}
