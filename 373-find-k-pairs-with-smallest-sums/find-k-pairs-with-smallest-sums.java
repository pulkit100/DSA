class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        // Making priority queue

        PriorityQueue<int[]> pq = new PriorityQueue<>( (a, b) -> Integer.compare(b[0], a[0]) );

        int m = nums1.length;
        int n = nums2.length;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                
                int sum = nums1[i] + nums2[j];

                if (pq.size() < k ) {
                    pq.offer(new int[]{sum, i, j});
                }
                else if ( pq.peek()[0] > sum ) {
                    pq.poll();
                    pq.offer(new int[]{sum, i, j});
                }
                else {
                    break;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        while ( !pq.isEmpty() ) {
            int[] pair = pq.poll();

            List<Integer> temp = new ArrayList<>();

            temp.add(nums1[pair[1]]);
            temp.add(nums2[pair[2]]);

            ans.add(temp);
        }

        return ans;
    }
}