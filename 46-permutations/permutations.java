class Solution {

    public void backTrack(int[] nums, int index , List<List<Integer>> result) {

        if ( index == nums.length ) {
            List<Integer> temp = new ArrayList<>();

            for (int num: nums ) {
                temp.add( num );
            }

            result.add(temp);
            return;
        }

        for (int i=index; i<nums.length; i++) {
            
            // 1 choose 
            swap(nums, index, i);

            // 2. explore 
            backTrack(nums, index + 1, result);

            // 3. undo
            swap(nums, index, i);

        }
    }

    public int[] swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return nums;
    }

    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        backTrack(nums, 0, result);

        return result;
    }
}