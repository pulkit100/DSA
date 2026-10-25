
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        // Solving this queston with the recursion approach

        if ( head == null || head.next == null )
            return head;

        ListNode temp = head.next;
        head.next = swapPairs( head.next.next );
        temp.next = head;

        return temp; 
    }
}