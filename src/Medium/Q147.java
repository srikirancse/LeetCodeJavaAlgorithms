package Medium;

/**
 * Created by Srikiran Sistla on 4/28/2017.
 * Insertion Sort List
 */
public class Q147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head, next = null;
        ListNode l = new ListNode(0);
        while (curr!=null){
            next = curr.next;
            ListNode p = l;
            while (p.next != null && p.next.val < curr.val) p = p.next;
            curr.next = p.next;
            p.next = curr;
            curr = next;
        }
        return l.next;
    }
}
