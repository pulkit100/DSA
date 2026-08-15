import java.util.*;

class Solution {

    public void solve(int start, int k, List<Integer> temp, List<List<Integer>> res, int n) {

        // Base case 1
        if (k == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // Base case 2
        if (start > n) {
            return;
        }

        // 1. Choose
        temp.add(start);

        // 2. Explore
        solve(start + 1, k - 1, temp, res, n);

        // 3. Undo / Backtrack
        temp.remove(temp.size() - 1);

        // 4. Don't choose
        solve(start + 1, k, temp, res, n);
    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solve(1, k, temp, res, n);

        return res;
    }
}