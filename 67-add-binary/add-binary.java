class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder str = new StringBuilder();
        int n = a.length();
        int m = b.length();

        int carry = 0;

        while ( n > 0 || m > 0 ) {
            int val1 = 0;
            int val2 = 0;

            int sum = carry;
           if (n > 0) {
                val1 = a.charAt(n - 1) - '0';
                sum += val1;
            }

            if (m > 0) {
                val2 = b.charAt(m - 1) - '0';
                sum += val2;
            }

            str.append( sum % 2);
            carry = sum / 2;

            if ( n > 0)
            n--;
            if ( m > 0)
            m--;
        }

        if (carry != 0) {
            str.append(carry);
        }

        str.reverse();

        return str.toString();
    }
}