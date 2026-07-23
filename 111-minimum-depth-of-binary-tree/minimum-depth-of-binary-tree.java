import java.util.*;
class Solution {
    public int minDepth(TreeNode root) {
        
        if ( root == null) {
            return 0;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        int depth = 1;
        while (!que.isEmpty()) {

            int size = que.size();
            
            for (int i=0; i<size; i++) {
                TreeNode current = que.poll();

                if (current.left== null && current.right == null) {
                    return depth;
                }

                if (current.left != null) {
                    que.offer(current.left);
                }
                if (current.right != null) {
                    que.offer(current.right);
                }
            }

            depth++;
        }

        return -1;

    }
}