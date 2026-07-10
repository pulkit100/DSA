// import java.util.*;
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
//         List<Integer> list = new ArrayList<>();

//         ListNode temp1 = list1;
//         ListNode temp2 = list2;
        
//         while ( temp1 != null ) {
//             list.add(temp1.val);
//             temp1 = temp1.next;
//         }

//         while ( temp2 != null ) {
//             list.add(temp2.val);
//             temp2 = temp2.next;
//         }

//         list.sort(null);

//         ListNode dummy = new ListNode(-1);
//         ListNode curr = dummy;

//         for (int val : list) {
//             curr.next = new ListNode(val);
//             curr = curr.next;
//         }

//         return dummy.next;
//     }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while ( t1 != null && t2 != null ) {
            
            if ( t1.val < t2.val ) {
            
                curr.next = t1;
                curr = t1;
                t1 = t1.next;
            } else {

                curr.next = t2;
                curr = t2;
                t2 = t2.next;

            }
        }

        if ( t1 != null ) {
            curr.next = t1;
            
        } 
        if (t2 != null) {
            curr.next = t2;
            
        }

        return dummy.next;
    }
}







