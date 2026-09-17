class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        // Three pointers will be there 
        int i = 0;
        int j = 0;
        int k = n-1;
        
        while ( j<=k ) {

            if ( nums[j] == 1 ) { // j is checking for 1, if 1 found then it will move 
                j++;
            } else if ( nums[j] == 2 ) {
                // swap with last
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;

            } else {
                // nums[j] will be equal to 0, that's why again swap with first
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }
        }
    }
}