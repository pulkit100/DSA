
// class Solution {
//     int count = 0;

//     public void inorder(TreeNode root ) {
//         if ( root == null ) {
//             return;
//         }

//         inorder(root.left);
//         count ++;

//         inorder(root.right);
//     }
//     public int countNodes(TreeNode root) {
       
//         inorder(root);

//         return count;
//     }
// }

class Solution {

    public int getLeftHeight( TreeNode root ) {
        TreeNode temp = root;
        int count = 0;

        while ( temp != null ) {
            temp = temp.left;
            count ++;
        }

        return count;
    }

    public int getRightHeight( TreeNode root ) {
        TreeNode temp = root;
        int count = 0;

        while ( temp != null ) {
            temp = temp.right;
            count ++;
        }

        return count;
    }

    public int countNodes(TreeNode root) {

        if ( root == null ) {
            return 0;
        }

        int lh = getLeftHeight(root);
        int rh = getRightHeight(root);

        if ( lh == rh ) {
            return (int) Math.pow( 2, lh ) - 1;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}


