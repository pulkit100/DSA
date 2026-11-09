import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int res = 0;

        for ( int i=0; i<n; i++) {

            char ch = s.charAt(i);

            if ( set.contains(ch) ) {
                res += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }

    if ( !set.isEmpty() ) {
        res += 1;
        }

    return res;
    }
}