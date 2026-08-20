class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n = nums.length;
        int count = 0;
        int currSum = 0;
        
        for (int i=0; i<n; i++) {
            currSum = 0;
            for ( int j = i; j<n; j++) {
                currSum += nums[j];
                if ( currSum == k ) {
                    count ++;
                }
            }
        }

        return count;
    }
}