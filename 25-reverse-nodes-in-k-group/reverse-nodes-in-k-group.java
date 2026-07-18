
class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {

            // Find kth node
            ListNode kth = getKthNode(groupPrev, k);

            if (kth == null)
                break;

            ListNode groupNext = kth.next;

            // Disconnect current group
            kth.next = null;

            // Start node of current group
            ListNode groupStart = groupPrev.next;

            // Reverse current group
            ListNode newHead = reverse(groupStart);

            // Connect previous part with reversed group
            groupPrev.next = newHead;

            // Connect reversed group with remaining list
            groupStart.next = groupNext;

            // Move groupPrev to end of reversed group
            groupPrev = groupStart;
        }

        return dummy.next;
    }

    // Reverse a linked list
    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Returns kth node starting after curr
    private ListNode getKthNode(ListNode curr, int k) {

        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }

        return curr;
    }
}