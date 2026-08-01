
class Solution {
  
    int prevOrder = 0;
    public int kthSmallest(TreeNode root, int k) {

        if ( root == null ) {
            return -1;
        }

        if (root.left != null) {
            int leftAns = kthSmallest(root.left, k);
            if ( leftAns != -1 ) {
                return leftAns;
            }
        }

        prevOrder = prevOrder + 1;
        if ( prevOrder == k ) {
            return root.val;
        }

        if (root.right != null) {
            int rightAns = kthSmallest(root.right, k);
            if ( rightAns != -1 ) {
                return rightAns;
            }
        }

        return -1;
    }
}