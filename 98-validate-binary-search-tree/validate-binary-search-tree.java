import java.util.*;
class Solution {

    public void inOrder(TreeNode root, List<Integer> list) {
        if ( root == null ) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inOrder(root, list);
        int n = list.size();

        for (int i=1; i<n; i++) {
            if ( list.get(i) <= list.get(i-1) ) {
                return false;
            }
        }

        return true;
    }
}