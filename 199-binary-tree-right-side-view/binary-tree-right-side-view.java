
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while ( !queue.isEmpty() ) {
            int size = queue.size();

            TreeNode current = null;
            for (int i=0; i<size; i++) {
                current = queue.poll();

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            res.add(current.val);
        }

        return res;
    }
}