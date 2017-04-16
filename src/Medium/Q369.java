package Medium;

/**
 * Created by Srikiran Sistla on 4/16/2017.
 * Plus One Linked List
 */
public class Q369 {
    public ListNode plusOne(ListNode head) {
        if (helper(head) == 0) return head;
        else {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
    }

    private int helper(ListNode head) {
        if (head == null) return 1;
        int carry = helper(head.next);
        if (head.next == null || carry == 1 ) {
            if (head.val == 9){
                head.val = 0;
                return 1;
            }
            else {
                head.val++;
                return 0;
            }
        }
        return 0;
    }
}