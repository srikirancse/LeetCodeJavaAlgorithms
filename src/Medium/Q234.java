package Medium;

/**
 * Created by Srikiran Sistla on 4/14/2017.
 * Check pallindrome linked list
 */
public class Q234 {
    public boolean isPalindrome(ListNode head) {
        // Linked list with none or 1 node is always palindromic
        if (head == null || head.next == null) return true;
        // Condition for LinkedList with 2 nodes
        if (head.next.next == null) return head.val == head.next.val;
        ListNode slow = head, fast = head, prev = null;
        boolean flag = false;
        while (fast.next != null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            head.next = prev;
            prev = head;
            if (fast.next == null){
                flag = true;
                break;
            }
            head = slow;
        }
        // If is hit if there are odd number of nodes in the LinkedList
        if (flag) slow = slow.next;
        // Else is hit if there are even number of nodes in the LinkedList
        else {
            slow = slow.next;
            head.next = prev;
        }
        // Condition for LinkedList with 3 nodes
        if (slow.next == null) return (prev != null ? prev.val : 0) == slow.val;
        while (slow!=null){
            if (slow.val!=head.val) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
}
