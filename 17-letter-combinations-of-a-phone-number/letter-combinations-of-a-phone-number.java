import java.util.*;
class Solution {

    public void backTrack(String digits, int index , StringBuilder current, String[] keypad,  List<String> result ) {
        // base case 
        if ( index == digits.length() ) {

            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i=0; i<letters.length(); i++) {
            
            char ch = letters.charAt(i);
            // 1. chooses
            current.append(ch);

            // 2. Explore
            backTrack(digits, index+1 , current, keypad, result );

            // 3. undo
            current.deleteCharAt(current.length() - 1);
        }

    }

    public List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<>();

        if ( digits.length() == 0 ) {
            return result;
        }

        String[] keypad = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        StringBuilder current = new StringBuilder();

        backTrack(digits, 0, current, keypad, result );

        return result;
    }
}