public class Offer056 {
    public boolean findTarget(TreeNode root, int k){
        HashSet<Integer> hashset = new HashSet<>();
        Deque<TreeNode> stack =  new ArrayDeque<>();
        while(root != null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }

            TreeNode curr = stack.pop();
            if(hashset.contains(k-curr.val)){
                return true;
            }else{
                hashset.add(curr.val);
            }

            root = curr.right;
        }
        return false;
    }
}
