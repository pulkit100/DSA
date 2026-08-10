import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
        
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();

        while ( temp != null ) {
            list.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(list);

        temp = head;
        int i = 0;

        while ( temp != null ) {
            temp.val = list.get(i); 
            temp = temp.next;
            i++;
        }

        return head;
    }
}