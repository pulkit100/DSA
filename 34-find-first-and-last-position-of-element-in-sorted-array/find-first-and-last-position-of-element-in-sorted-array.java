class Solution {

    public int rightMost(int[] nums, int n, int target) {

        int l = 0;
        int r = n - 1;
        int rightMost = -1;

        while ( l<=r ) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) {
                rightMost = mid;
                l = mid + 1;
            } else if ( nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return rightMost;
    }


    public int leftMost(int[] nums, int n, int target) {

        int l = 0;
        int r = n - 1;
        int leftMost = -1;

        while ( l<=r ) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) {
                leftMost = mid;
                r = mid - 1;
            } else if ( nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return leftMost;
    }


    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;

        int leftMost = leftMost(nums, n, target);
        int rightMost = rightMost(nums, n, target);

        return new int[]{leftMost, rightMost};
    }
}