class Solution {

    TreeNode prev = null;
    int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev.val);
        }

        prev = root;

        inorder(root.right);
    }
}