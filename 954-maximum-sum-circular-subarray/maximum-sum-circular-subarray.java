class Solution {

    // public int[] rotate(int[] nums) {
    //     int n = nums.length;

    //     int last = nums[n-1];

    //     for (int i=n-1; i>0; i--) {
    //         nums[i] = nums[i-1];
    //     }

    //     nums[0] = last;

    //     return nums;
    // }

    public int totalSum(int[] nums) {

        int n = nums.length;
        int sum = 0;

        for (int i=0; i<n; i++) {

            sum+= nums[i];
        }

        return sum;
    }

    public int kadaneMax(int[] nums) {

        int n = nums.length;
        int sum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i=0; i<n; i++) {

            currSum += nums[i];
            sum = Math.max(sum, currSum);

            if ( currSum < 0 ) {
                currSum = 0;
            }
        }

        return sum;
    }

    public int kadaneMin(int[] nums) {

        int n = nums.length;
        int sum = Integer.MAX_VALUE;
        int currSum = 0;

        for (int i=0; i<n; i++) {

            currSum += nums[i];
            sum = Math.min(sum, currSum);

            if ( currSum > 0 ) {
                currSum = 0;
            }
        }

        return sum;
    }

    public int maxSubarraySumCircular(int[] nums) {
        
            int n = nums.length;

            int sum = totalSum(nums);

            int minSum = kadaneMin(nums);

            int maxSum = kadaneMax(nums);

            int circular = sum - minSum;

            if ( maxSum < 0 ) {
                return maxSum;
            }
        
        return Math.max(circular, maxSum);
    }
}