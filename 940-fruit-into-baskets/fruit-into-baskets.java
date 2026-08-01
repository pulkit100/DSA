import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int i=0;

        for (int j=0; j<fruits.length; j++) {
            
            int num = fruits[j];
            map.put(num, map.getOrDefault(num, 0) + 1);

            while (map.size() > 2) {

                int n = fruits[i];
                map.put(n, map.get(n) - 1);

                if (map.get(n) == 0 ) {
                    map.remove(n);
                }
                i++;
            }

            if (map.size() <= 2 ) {
                result = Math.max(result, j-i+1);
            }
        }

        return result;
    }
}