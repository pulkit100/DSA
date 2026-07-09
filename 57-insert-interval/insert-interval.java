
import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        if (intervals.length == 0) {
            return new int[][]{ newInterval };
        }
        List<int[]> list = new ArrayList<>();
        List<int[]> result = new ArrayList<>();

        for (int i=0; i<intervals.length; i++) {
            
            int start = intervals[i][0];
            int end = intervals[i][1];

            list.add(new int[]{start, end});
        }
        int e1 = newInterval[0];
        int e2 = newInterval[1];

        list.add(new int[]{e1, e2});

        list.sort((a, b) -> Integer.compare(a[0], b[0]));

        int start = list.get(0)[0];
        int end = list.get(0)[1];

        for (int i=1; i<list.size(); i++) {

            if (list.get(i)[0] <= end) {
                end = Math.max(end, list.get(i)[1]);
            } else {
                result.add(new int[]{start, end});

                start = list.get(i)[0];
                end = list.get(i)[1];
            }
        }

        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}