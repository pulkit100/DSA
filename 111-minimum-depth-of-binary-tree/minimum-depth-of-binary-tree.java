// import java.util.*;
// class Solution {
//     public int minDepth(TreeNode root) {
        
//         if ( root == null) {
//             return 0;
//         }

//         Queue<TreeNode> que = new LinkedList<>();
//         que.offer(root);

//         int depth = 1;
//         while (!que.isEmpty()) {

//             int size = que.size();
            
//             for (int i=0; i<size; i++) {
//                 TreeNode current = que.poll();

//                 if (current.left== null && current.right == null) {
//                     return depth;
//                 }

//                 if (current.left != null) {
//                     que.offer(current.left);
//                 }
//                 if (current.right != null) {
//                     que.offer(current.right);
//                 }
//             }

//             depth++;
//         }

//         return -1;

//     }
// }


class Solution {
    public int minDepth(TreeNode root) {

        if ( root == null ) {
            return 0;
        }

        if ( root.left == null && root.right == null) {
            return 1;
        }
        
        int l = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
        int r = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;

        return 1 + Math.min( l, r);
    }
}        
