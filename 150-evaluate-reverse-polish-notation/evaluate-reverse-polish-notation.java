import java.util.*;
class Solution {

    public int operate(int n1, int n2, String token) {

        if (token.equals("+")) {
            return n1 + n2;
        }

        if (token.equals("-")) {
            return n2 - n1;
        }

        if (token.equals("*")) {
            return n1 * n2;
        }

        if (token.equals("/")) {
            return n2 / n1;
        }

        return -1;
    }
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;

        for (int i=0; i<n; i++) {
            
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") ||
                token.equals("/") ) {
                
                int n1 = stack.pop();
                int n2 = stack.pop();

                int result = operate(n1, n2, token);
                
                stack.push(result);

            } else {

                int token1 = Integer.parseInt(token);
                stack.push(token1);
            }
        }

        return stack.peek();

    }
}