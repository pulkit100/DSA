import java.util.*;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if ( root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i=0; i<size; i++) {
                
                TreeNode current = queue.poll();
                
                level.add(current.val);

                if ( current.left != null) {
                    queue.offer(current.left);
                }

                if ( current.right != null) {
                    queue.offer(current.right);
                }
            }
            res.add(0, level);
        }

        return res;
    }
}
