import java.util.HashMap;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i=0; i<n; i++) {

            if (map.containsKey(nums[i])) {
                int diff = i - map.get(nums[i]);
                if (diff <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }

            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
}