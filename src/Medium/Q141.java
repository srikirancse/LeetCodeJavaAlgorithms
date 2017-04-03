package Medium;

/**
 * Created by Srikiran Sistla on 3/25/2017.
 */
public class Q141 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode start = head;
        while (fast.next!= null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                while (start != slow){
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }
        return null;
    }
}
