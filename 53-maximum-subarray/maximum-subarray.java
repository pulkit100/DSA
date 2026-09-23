class Solution {
    public int maxSubArray(int[] nums) {
        
        // int n = nums.length;
        // int currSum = 0;
        // int max = Integer.MIN_VALUE;

        // for (int i=0; i<n; i++) {

        //     currSum += nums[i];
        //     max = Math.max( sum, currSum);

        //     if ( currSum < 0 ) {
        //         currSum = 0;
        //     }
        // }

        // return sum;

        int n = nums.length;
        int currSum = 0;
        int max = nums[0];

        for ( int i=0; i<n; i++) {
            currSum = Math.max ( nums[i], currSum + nums[i]);

            max = Math.max( currSum, max );
        }

        return max;
    }
}