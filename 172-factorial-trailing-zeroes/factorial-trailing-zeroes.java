// class Solution {
//     public int trailingZeroes(int n) {
        
//         if ( n==0 )
//             return 0;

//         int fact = 1;

//         for (int i=1; i<=n; i++) {
//             fact *= i;
//         }

//         int count = 0;
        
//         while ( fact != 0) {
//             int last = fact % 10;

//             if ( last == 0) {
//                 count++;
//             } else {
//                 break;
//             }
//             fact /= 10;
//         }

//         return count;
//     }
// }

// class Solution {
//     public int trailingZeroes(int n) {

//         int count = 0;

//         for (int i=5; i<=n; i = i*5) {
//             count = count + n/i;
//         }

//         return count;
//     }
// }


class Solution {
    public int trailingZeroes(int n) {

        int count = 0;


        while ( n!= 0) {
            count += n / 5;
            n/= 5;
        }

        return count;
    }
}