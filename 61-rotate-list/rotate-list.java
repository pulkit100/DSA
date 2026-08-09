
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        // edge case         
        if ( head == null || head.next == null || k == 0) {
            return head;
        }

        // connect
        int L = 1;  // atleast one head is there we will start counting from here

        ListNode tail = head;

        while ( tail.next != null ) {
            tail = tail.next;
            L++;
        }


        k = k % L;

        if ( k == 0 ) {
            return head;
        } 
        tail.next = head;

        int remain = L - k; // if k = 2 then remain = 3
        ListNode newTail = head;

        for (int c=1; c<remain; c++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}