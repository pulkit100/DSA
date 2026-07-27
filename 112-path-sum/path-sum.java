
class Solution {

    public boolean inOrder(TreeNode root, int sum, int targetSum) {

        if ( root == null ) {
            return false;
        }

        sum += root.val;
        // if we have reached leaf node 

        if ( root.left == null && root.right == null ) {
            if ( sum == targetSum ) {
                return true;
            } else {
                return false;
            }
        }

        boolean leftSide = inOrder(root.left, sum, targetSum);
        boolean rightSide = inOrder(root.right, sum, targetSum);

        return leftSide || rightSide;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        int sum = 0;
        boolean res = inOrder(root, sum, targetSum);

        return res;
    }
}