
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        int count = 0;

        while ( temp != null) {
            count++;
            temp = temp.next;
        }
        // we are delteting a node from last node if n = 5 and count = 5 -- it will be 1st node
        if ( n == count) {
            return head.next;
        }

        int result = count - n;
        temp = head;

        while ( temp != null) {

            result--;
            if ( result == 0) {
                break;
            }

            temp = temp.next;
        }

        ListNode delNode = temp.next;
        temp.next = temp.next.next;

        return head;
    }
}