// import java.util.*;

// class Solution {
//     public void setZeroes(int[][] matrix) {

//         int m = matrix.length;
//         int n = matrix[0].length;

//         int[][] temp = new int[m][n];

//         // Copy matrix into temp
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 temp[i][j] = matrix[i][j];
//             }
//         }

//         // Find zeroes in original matrix
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {

//                 if (matrix[i][j] == 0) {

//                     // Make row zero
//                     for (int k = 0; k < n; k++) {
//                         temp[i][k] = 0;
//                     }

//                     // Make column zero
//                     for (int k = 0; k < m; k++) {
//                         temp[k][j] = 0;
//                     }
//                 }
//             }
//         }

//         // Copy temp back to matrix
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = temp[i][j];
//             }
//         }
//     }
// }

class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // 1. Check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
            }
        }

        // 2. Check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
        }

        // 3. Use first row & first column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // 4. Set rows to zero
        for (int i = 1; i < m; i++) {

            if (matrix[i][0] == 0) {

                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 5. Set columns to zero
        for (int j = 1; j < n; j++) {

            if (matrix[0][j] == 0) {

                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 6. First row
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // 7. First column
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}