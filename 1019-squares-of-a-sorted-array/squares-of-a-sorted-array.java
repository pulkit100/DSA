import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;

        for (int i=0; i<n; i++) {
            int sqr = nums[i] * nums[i];

            nums[i] = sqr;
        }

        Arrays.sort(nums);
        
        return nums;
    }
}