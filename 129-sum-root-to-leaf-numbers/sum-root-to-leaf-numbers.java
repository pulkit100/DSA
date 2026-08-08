
class Solution {
    
    public int helper(TreeNode root, int curr ) {

        if ( root == null ) {
            return 0;
        }
        
        curr = (curr * 10) + root.val;

        if ( root.left == null && root.right == null ) {
            return curr;
        }

        int l = helper(root.left, curr );
        int r = helper(root.right, curr);

        return l + r;
    }

    public int sumNumbers(TreeNode root) {
        
        return helper(root, 0);
    }
}