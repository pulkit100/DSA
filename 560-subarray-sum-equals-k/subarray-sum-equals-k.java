
// import java.util.*;
// class Solution {
//     public int subarraySum(int[] nums, int k) {
        

//         int n = nums.length;
//         int count = 0;
//         int currSum = 0;
        
//         for (int i=0; i<n; i++) {
//             currSum = 0;
//             for ( int j = i; j<n; j++) {
//                 currSum += nums[j];
//                 if ( currSum == k ) {
//                     count ++;
//                 }
//             }
//         }

//         return count;
//     }
// }

import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // only for case where prefix sum from start is equals k
        // suppose (sum - k) == 0

        int n = nums.length;
        int count = 0;
        int sum = 0;

        for (int i=0; i<n; i++) {

            sum += nums[i];

            if ( map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }    

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}