// Total 3 solutions -- set, hashmap
// import java.util.*;
// class Solution {
//     public int longestPalindrome(String s) {
        
//         HashSet<Character> set = new HashSet<>();
//         int n = s.length();
//         int res = 0;

//         for ( int i=0; i<n; i++) {

//             char ch = s.charAt(i);

//             if ( set.contains(ch) ) {
//                 res += 2;
//                 set.remove(ch);
//             } else {
//                 set.add(ch);
//             }
//         }

//     if ( !set.isEmpty() ) {
//         res += 1;
//         }

//     return res;
//     }
// }


import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        for ( int i=0; i<n; i++) {
            char ch = s.charAt(i);

            if ( map.containsKey( ch )) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int res = 0;

        for (int value : map.values()) {
            
            if ( value % 2 == 0 ) {
                res += value;
                
            } else {
                res += value - 1;
            }
        }

        if (res < s.length() ) {
            res ++; 
        }
        return res;
    }
}










