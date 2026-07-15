import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i=0; i<n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            } 
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i=0; i<n; i++) {
            int num = nums[i];
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int i=0;
        for (int num=min; num<=max; num++) {
            int freq = 0;
            if (map.get(num) != null) {
                freq = map.get(num);
            }
            
            while ( freq > 0) {
                nums[i] = num;
                freq--;
                i++;
            }
        }

        return nums;
    }
}