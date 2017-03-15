package Easy;

/**
 * Created by Srikiran Sistla on 1/16/2017.
 */

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    void appendToTail(int d){
        ListNode end = new ListNode(d);
        ListNode n = this;
        while (n.next!=null){
            n = n.next;
        }
        n.next=end;
    }

    void displayList(){
        ListNode n = this;
        while (n != null){
            System.out.println(n.val);
            n = n.next;
        }
    }
}
public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        System.out.println("It starts here");
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            System.out.println("Displaying prev1");
            prev.displayList();
            prev.next = cur;
            prev = cur;
            System.out.println("Displaying prev2");
            prev.displayList();
            System.out.println("Displaying Head");
            head.displayList();

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        System.out.println("It ends here");
        return head.next;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        ListNode l1 = new ListNode(6);
        ListNode l2 = new ListNode(5);
        l1.appendToTail(8);
        l1.appendToTail(9);
        l2.appendToTail(2);
        l2.appendToTail(6);
        ListNode l3 = q2.addTwoNumbers(l1,l2);
        l3.displayList();
    }
}