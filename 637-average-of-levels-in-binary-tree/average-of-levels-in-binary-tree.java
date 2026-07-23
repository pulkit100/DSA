import java.util.*;
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> list = new ArrayList<>();

        if ( root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            
            int size = queue.size();
            double sum = 0; 

            for (int i=0; i<size; i++) {
                TreeNode current = queue.poll();

                sum += current.val;

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            list.add(sum / size);
        }

        return list;
    }
}