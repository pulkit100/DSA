class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // int n = nums1.length;
        // int[] result = new int[n];

        // boolean found = false;

        // for(int i=0; i<n; i++) {
        //     found = false;
        //     for (int j=0; j<nums2.length; j++) {

        //         if ( nums1[i] == nums2[j] ) {
        //             found = true; // mil gya
        //         }

        //         if ( found && nums2[j] > nums1[i] ) {
        //             result[i] = nums2[j];
        //             break;
        //         }
        //     }
        // }

        // for ( int i=0; i<n; i++) {
        //     if ( result[i] == 0 ) {
        //         result[i] = -1;
        //     }
        // }

        // return result;


        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int i=0; i<nums2.length; i++) {

            while ( !st.isEmpty() && nums2[i] > st.peek() ) {
                map.put( st.pop(), nums2[i] );
            }

            st.push(nums2[i]);
        }

        int[] res = new int[nums1.length];

        for ( int i=0; i<nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}