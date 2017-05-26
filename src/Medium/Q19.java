package Medium;

/**
 * Created by Srikiran Sistla on 5/17/2017.
 * Remove nth node from the end
 */
public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start, fast = start;

        for (int i = 0; i < n; i++){
            fast = fast.next;
        }

        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }
}
