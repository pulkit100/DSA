class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int currSum = 0;
        int sum = Integer.MIN_VALUE;

        for (int i=0; i<n; i++) {

            currSum += nums[i];
            sum = Math.max( sum, currSum);

            if ( currSum < 0 ) {
                currSum = 0;
            }
        }

        return sum;
    }
}