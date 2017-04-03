package Medium;

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