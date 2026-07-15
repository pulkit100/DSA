// import java.util.*;

// class Solution {
//     public int[] sortArray(int[] nums) {
        
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = nums.length;

//         for (int i=0; i<n; i++) {
//             if (!map.containsKey(nums[i])) {
//                 map.put(nums[i], 1);
//             } else {
//                 map.put(nums[i], map.get(nums[i]) + 1);
//             } 
//         }

//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
        
//         for (int i=0; i<n; i++) {
//             int num = nums[i];
//             min = Math.min(min, num);
//             max = Math.max(max, num);
//         }

//         int i=0;
//         for (int num=min; num<=max; num++) {
//             int freq = 0;
//             if (map.get(num) != null) {
//                 freq = map.get(num);
//             }
            
//             while ( freq > 0) {
//                 nums[i] = num;
//                 freq--;
//                 i++;
//             }
//         }

//         return nums;
//     }
// }

// merge sort 
class Solution {

    public void merge(int[] nums, int s, int mid, int e) {

        int n1 = mid - s + 1;
        int n2 = e - (mid + 1) + 1;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i=0; i<n1; i++) {
            arr1[i] = nums[s + i];
        }

        for (int i=0; i<n2; i++) {
            arr2[i] = nums[mid+1 + i];
        }

        // two pointers
        int i=0;
        int j=0;
        int k = s;

        while (i<n1 && j<n2) {

            if (arr1[i] < arr2[j]) {
                nums[k] = arr1[i];
                i++;
            } else {
                nums[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i<n1) {
            nums[k] = arr1[i];
            i++;
            k++;
        }

        while (j<n2) {
            nums[k] = arr2[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] nums, int s, int e) {
        if (s < e) {
            int mid = s + (e - s)/ 2;

            mergeSort(nums, s, mid);
            mergeSort(nums, mid+1, e);
            merge(nums, s, mid, e);
        }
    }
    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}











