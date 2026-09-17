class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if ( k<=1 ) {
            return 0;
        }
        
        int n = nums.length;
        int i=0;
        int j=0;
        int count = 0;
        int prod = 1;

        // sliding window ka khandani template

        while ( j<n ) {

            prod *= nums[j];

            while ( prod >= k ) {
                prod = prod / nums[i];
                i++;
            }

            count += j-i+1;
            j++;
        }

        return count;
    }
}