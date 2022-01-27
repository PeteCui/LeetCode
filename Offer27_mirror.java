public class Offer27_mirror {
    public TreeNode mirrorTree(TreeNode root) {
        
        if(root != null){
            TreeNode temp = root.left;
            root.left = mirrorTree(root.right);
            root.right = mirrorTree(temp);
            
        }
        return root;
    }
}
