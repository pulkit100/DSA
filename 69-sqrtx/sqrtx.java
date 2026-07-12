// class Solution {
//     public int mySqrt(int x) {
//         if (x == 0) {
//             return 0;
//         }

//         int ans = 1;

//         for (int i=1; i<=x; i++) {

//             long square = (long) i*i;

//             if ( square <= x) {
//                 ans = i;
//             } else {
//                 break;
//             }
//         }

//         return ans;
//     }
// }

class Solution {
    public int mySqrt(int x) {
        
        if ( x == 0) {
            return 0;
        }

        int low = 1; 
        int high = x;

        int ans = 1;
        while ( low <= high) {
            
            int mid = low + ( high - low) / 2;

            if ( (long) mid * mid > x) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}








