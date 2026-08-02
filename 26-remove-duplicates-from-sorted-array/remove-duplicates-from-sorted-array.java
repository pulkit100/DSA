class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[k-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

// import java.util.*;
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i: nums) {
//             map.put(i, map.getOrDefault(i, 0) + 1);
//         }

//         return map.size();
//     }
// }
