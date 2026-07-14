// class Solution {
//     public int hammingWeight(int n) {
        
//         int count = 0;
//         for (int i=31; i>=0; i--) {

//             if ( (n>>i & 1) == 1 ) { // trick to get ith bit -- right sift any int by i and do & operation 
//                 count++;
//             }
//         }

//         return count;
//     }
// }


// Better time complexity
class Solution {
    public int hammingWeight(int n) {

        // approach 2 (50 & 49) -- it will unset the right most bit

        int count = 0;
        while ( n != 0 ) {
            n = n & (n - 1);
            count++;
        }  

        return count;
    }
}