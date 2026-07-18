// worst case time complexity will be - O(2 * length)
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
        
//         ListNode temp = head;
//         int count = 0;

//         while ( temp != null) {
//             count++;
//             temp = temp.next;
//         }
//         // we are delteting a node from last node if n = 5 and count = 5 -- it will be 1st node
//         if ( n == count) {
//             return head.next;
//         }

//         int result = count - n;
//         temp = head;

//         while ( temp != null) {

//             result--;
//             if ( result == 0) {
//                 break;
//             }

//             temp = temp.next;
//         }

//         ListNode delNode = temp.next;
//         temp.next = temp.next.next;

//         return head;
//     }
// }

// slow and fast pointer krna hai to reduce time complexity
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;

        for (int i=0; i<n; i++) {
            fast = fast.next;
        }

        ListNode slow = head;
        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode delNode = slow.next;
        slow.next = slow.next.next;

        return head;
    }
}

