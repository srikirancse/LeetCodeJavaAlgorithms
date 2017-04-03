package Medium;

/**
 * Created by Srikiran Sistla on 3/20/2017.
 */


public class Q92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;
        ListNode returnHead = head;
        int count = 1;
        ListNode mNode;
        ListNode nNode = null;
        ListNode mPrevNode = null;
        while (count < m) {
            if (count == m - 1) mPrevNode = head;
            head = head.next;
            count++;
        }
        mNode = head;
        ListNode Node1 = mNode;
        ListNode Node2 = mNode.next;
        while (count < n && Node2 != null) {
            ListNode tempNode2 = Node2.next == null ? null : Node2.next;
            Node2.next = Node1;
            Node1 = Node2;
            Node2 = tempNode2;
            count++;
        }
        nNode = Node1;
        mNode.next = Node2;
        if (mPrevNode != null) {
            mPrevNode.next = nNode;
        }
        return m == 1 ? nNode : returnHead;
    }

    public static void main(String[] args) {
        Q92 q92 = new Q92();
        ListNode myList = new ListNode(1);
        myList.appendToTail(2);
        myList.appendToTail(3);
        ListNode result = q92.reverseBetween(myList, 2, 3);
        result.displayList();
    }
}
