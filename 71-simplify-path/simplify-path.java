import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();

        String[] tokens = path.split("/");
        StringBuilder str = new StringBuilder();

        for (int i=0; i<tokens.length; i++) {
            String token = tokens[i];

            if ( token.equals(".") || token.equals("") ) {
                continue;
            } else if (!stack.isEmpty() && token.equals("..")) {
                stack.pop();
            } else {
                if ( token.equals("..")) {
                    continue;
                }
                stack.push(token);
            }
        }

        if ( stack.isEmpty()) {
            return "/";
        }
        
        
        for (String dir : stack) {
            str.append("/");
            str.append(dir);
        }


        return str.toString();
    }
}