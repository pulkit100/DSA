
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if ( p == null && q == null) {
            return true;
        }

        if ( p== null || q == null) {
            return false;
        }

        if ( p.val != q.val ) {
            return false;
        }

        boolean r1 = isSameTree(p.left, q.left);
        boolean r2 = isSameTree(p.right, q.right);

        if ( r1 && r2) {
            return true;
        }

        return false;
    }
}