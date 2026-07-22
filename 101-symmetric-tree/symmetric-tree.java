
class Solution {

    public boolean check( TreeNode p, TreeNode q) {

        if (p==null && q==null) {
            return true;
        }

        if (p== null || q== null) {
            return false;
        }

        if ( p.val != q.val) {
            return false;
        }

        boolean r1 = check(p.left, q.right);
        boolean r2 = check(p.right, q.left);

        return r1 && r2;
    }
    
    public boolean isSymmetric(TreeNode root) {
        
        if ( root == null ) {
            return true;
        }

        return check(root.left, root.right);

    }
}