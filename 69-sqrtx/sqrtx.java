class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int ans = 1;

        for (int i=1; i<=x; i++) {

            long square = (long) i*i;
            
            if ( square <= x) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }
}