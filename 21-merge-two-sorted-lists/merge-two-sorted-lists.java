import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        List<Integer> list = new ArrayList<>();

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        
        while ( temp1 != null ) {
            list.add(temp1.val);
            temp1 = temp1.next;
        }

        while ( temp2 != null ) {
            list.add(temp2.val);
            temp2 = temp2.next;
        }

        list.sort(null);

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int val : list) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}