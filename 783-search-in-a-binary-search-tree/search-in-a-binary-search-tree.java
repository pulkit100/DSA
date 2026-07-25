
class Solution {
    TreeNode ans = null;

    public TreeNode searchBST(TreeNode root, int val) {
        if ( root == null ) {
            return ans; 
        }

        if ( root.val == val ) {
            ans = root;
            return ans;
        }

        if ( root.val > val ) {
            searchBST(root.left, val);
        } else {
            searchBST(root.right, val);
        }

        return ans;            
    }
}