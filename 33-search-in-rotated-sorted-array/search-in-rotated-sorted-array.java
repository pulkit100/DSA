class Solution {

    public int findPivot (int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while ( l<r ) {  // applying binary search but conditon is different

            int mid = l + (r-l) / 2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return r;
    }

    public int binarySearch(int l, int r, int[] nums, int target) {
        
        int idx = -1;

        while ( l<= r) {
            int mid = l + (r-l) / 2;

            if (nums[mid] == target) {
                idx = mid;
                break;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }

        return idx;
    }

    public int search(int[] nums, int target) {
        
        // finding pivot index -- i.e. the index of minimum element 

        int n = nums.length;
        int pivotIdx = findPivot(nums);

        int idx = binarySearch(0, pivotIdx - 1, nums, target);

        if (idx != -1) {
            return idx;
        } else {
            idx =  binarySearch(pivotIdx, n-1, nums, target);
        }

        return idx;

    }
}