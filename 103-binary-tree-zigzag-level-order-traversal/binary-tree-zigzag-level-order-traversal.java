import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();

        if ( root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i=0; i<size; i++) {
                
                TreeNode current = queue.poll();
                
                if (leftToRight == true) {
                    level.add(current.val);
                }
                if (leftToRight == false) {
                    level.add(0, current.val);
                }

                if ( current.left != null) {
                    queue.offer(current.left);
                }

                if ( current.right != null) {
                    queue.offer(current.right);
                }
            }

            leftToRight = !leftToRight;
            res.add(level);
        }

        return res;
    }
}