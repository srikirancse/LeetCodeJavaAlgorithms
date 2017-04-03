package Medium;

/**
 * Created by Srikiran Sistla on 3/24/2017.
 */
public class Q109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return toBST(head, null);
    }

    private TreeNode toBST(ListNode head, ListNode tail) {
        if (head == tail) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != tail && fast.next != tail ){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = toBST(head, slow);
        root.right = toBST(slow.next, tail);
        return root;
    }

    public static void main(String[] args) {
        ListNode myList = new ListNode(1);
        myList.appendToTail(2);
        myList.appendToTail(3);
        myList.appendToTail(4);
        myList.appendToTail(5);
        myList.appendToTail(6);
        myList.appendToTail(7);
        myList.appendToTail(8);
        Q109 q109 = new Q109();
        q109.sortedListToBST(myList);
    }
}
