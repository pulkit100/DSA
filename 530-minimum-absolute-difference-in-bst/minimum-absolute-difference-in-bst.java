// class Solution {

//     TreeNode prev = null;
//     int minDiff = Integer.MAX_VALUE;

//     public int getMinimumDifference(TreeNode root) {
//         inorder(root);
//         return minDiff;
//     }

//     private void inorder(TreeNode root) {

//         if (root == null)
//             return;

//         inorder(root.left);

//         if (prev != null) {
//             minDiff = Math.min(minDiff, root.val - prev.val);
//         }

//         prev = root;

//         inorder(root.right);
//     }
// }

class Solution {

    int minDiff = Integer.MAX_VALUE;
    TreeNode prev = null;
    public void inOrder(TreeNode root) {
        if ( root == null ) {
            return;
        }

        inOrder(root.left);
        if ( prev != null ) {
           minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root;
        inOrder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }
}