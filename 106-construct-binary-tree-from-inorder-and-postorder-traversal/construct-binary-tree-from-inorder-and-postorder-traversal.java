
class Solution {
    int idx;

    public TreeNode solve(int[] inorder, int[] postorder, int start, int end) {
        
        if ( start > end ) {
            return null;
        }
        
        int rootVal = postorder[idx--];

        int i;
        for (i = start; i<=end; i++) {
            if ( rootVal == inorder[i] ) {
                break;
            }
        }

        TreeNode root = new TreeNode(rootVal);

        root.right = solve(inorder, postorder, i+1, end);
        root.left = solve(inorder, postorder, start, i-1);

        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length - 1;

        return solve(inorder, postorder, 0, inorder.length - 1);
    }
}