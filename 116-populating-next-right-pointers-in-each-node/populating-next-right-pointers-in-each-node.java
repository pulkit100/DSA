

class Solution {
    public Node connect(Node root) {
        
        if ( root == null ) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while ( !queue.isEmpty() ) {
            
            Node prev = null; 
            int size = queue.size();
            
            for (int i=0; i<size; i++) {
                
                Node current = queue.poll();
                
                if ( prev != null ) {
                    prev.next = current;
                }
                prev = current;

                if ( current.left != null ) {
                    queue.offer(current.left);
                }

                if ( current.right != null ) {
                    queue.offer(current.right);
                }

            }

            prev.next = null;
        }

        return root;
    }
}