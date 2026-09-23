// class Solution {
//     public int maximumSum(int[] arr) {
        
//         int n = arr.length;

//         int noDel = arr[0];
//         int oneDel = Integer.MIN_VALUE;
        
//         int ans = arr[0];

//         for (int i=1; i<n; i++) {

//             int oldNoDel = noDel;

//             noDel = Math.max( noDel + arr[i], arr[i]);

//             oneDel = Math.max( oneDel + arr[i], oldNoDel );

//             ans = Math.max( ans, Math.max( noDel, oneDel ));    

//         }

//         return ans;
//     }
// }

class Solution {
    public int maximumSum(int[] arr) {

        long noDel = arr[0];
        long oneDel = Long.MIN_VALUE / 2;
        long ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            long oldNoDel = noDel;

            noDel = Math.max(arr[i], noDel + arr[i]);

            oneDel = Math.max(oldNoDel, oneDel + arr[i]);

            ans = Math.max(ans, Math.max(noDel, oneDel));
        }

        return (int) ans;
    }
}