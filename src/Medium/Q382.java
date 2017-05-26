package Medium;

import java.util.Random;

/**
 * Created by Srikiran Sistla on 5/10/2017.
 * Return a random node's value from a linked list
 */
public class Q382 {

    ListNode head;
    Random random;

    public Q382(ListNode head){
        this.head = head;
    }

    public int getRandom(){
        if (head.next == null) return head.val;
        ListNode h = head;
        int res = head.val;
        for (int i = 0; h.next != null; i++){
            h = h.next;
            if (random.nextInt(i+1) == i) res = h.val;
        }
        return res;
    }
}
