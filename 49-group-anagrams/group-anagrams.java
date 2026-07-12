import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        int n = strs.length;
        
        for (int i=0; i<n; i++) {
            String word = strs[i];

            char[] arr = word.toCharArray();

            Arrays.sort(arr);
            String sorted = new String(arr);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sorted, list);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> list: map.values()) {
            result.add(list);
        }

        // return new ArrayList<>(map.values());
        
        return result;
    }
}