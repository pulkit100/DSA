import java.util.*;
class Solution {

    public void fill( TreeNode root, List<Integer> temp, int sum, int targetSum, List<List<Integer>> res) {

        if ( root == null ) {
            return;
        }

        sum += root.val;
        temp.add(root.val);

        if ( root.left == null && root.right == null ) {
            if ( sum == targetSum ) {
                res.add(new ArrayList<>(temp));
            }
            temp.remove(temp.size() - 1);
            return;
        }

        fill(root.left, temp, sum, targetSum, res);
        fill(root.right, temp, sum, targetSum, res);
        temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int sum = 0;
        fill (root, temp, sum, targetSum, res);

        return res;
    }
}