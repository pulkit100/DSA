import java.util.*;
class Solution {
    public Node connect(Node root) {
        
        if ( root == null ) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer( root );

        while ( !queue.isEmpty() ) {

            int size = queue.size();
            Node prev = null;

            for (int i=0; i<size; i++) {

                Node curr = queue.poll();
                
                if ( prev != null ) {
                    prev.next = curr;
                }

                prev = curr;

                if ( prev.left != null ) {
                    queue.offer( prev.left );
                }

                if ( prev.right != null ) {
                    queue.offer( prev.right );
                }
            }

            prev.next = null;
        }

        return root;
    }
}