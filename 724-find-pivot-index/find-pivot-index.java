class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        
        for (int num: nums ) {
            sum += num;
        }

        int cs = 0;
        int ls = 0;
        int rs = 0;

        for (int i=0; i<n; i++) {

            ls = cs;
            rs = sum - cs - nums[i];

            // if ( i==0 && ls == rs ) {
            //     return 0;
            // }

            if ( ls == rs ) {
                return i;
            }

            cs += nums[i];
        }

        return -1;
    }
}