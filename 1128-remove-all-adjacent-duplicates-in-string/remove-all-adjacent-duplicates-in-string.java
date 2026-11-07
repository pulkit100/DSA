import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();

        StringBuilder result = new StringBuilder();
        int n = s.length();

        for ( int i=0; i<n; i++ ) {
            
            if ( st.isEmpty() || st.peek() != s.charAt(i) ) {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }

        while(!st.isEmpty()) {
            result.append( st.pop() );
        }

        result.reverse();
        return result.toString();
    }
}