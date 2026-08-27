import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        // int n = nums.length;

        // for (int i=0; i<n; i++) {
        //     int sqr = nums[i] * nums[i];

        //     nums[i] = sqr;
        // }

        // Arrays.sort(nums);
        
        // return nums;


        int n = nums.length;
        int[] res = new int[n];

        int k = n-1;
        int i = 0, j = n-1;

        while ( k >= 0 ) {

            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];

            if ( a>b ) {
                res[k] = a;
                i++;
            } else {
                res[k] = b;
                j--;
            }

            k--;
        }

        return res;
    }
}