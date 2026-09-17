import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        int closestSum = 100000;

        for ( int k=0; k<=n-3; k++ ) {
            
            int i=k+1;
            int j=n-1;

            while ( i<j ) {
                sum = nums[k] + nums[i] + nums[j];

                if ( Math.abs(target-sum) < Math.abs(target-closestSum ) ) {
                    closestSum = sum;
                }

                if ( sum < target ) {
                    i++;
                } else {
                    j--;
                }
            }
            
        }

        return closestSum;
    }
}