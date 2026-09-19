import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
         
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(); 

        // For example - currSum (3, 2) 

        map.put( 0, -1 );
        int currSum = 0;
        int result = 0; // length

        for ( int i=0; i<n; i++) {
            
            currSum += ( nums[i] == 1 ) ? 1 : -1;

            if ( map.containsKey( currSum )) {
                
                result = Math.max(result , i - map.get(currSum));

                

            } else {
                map.put(currSum, i);
            }
        }

        return result;
    }
}