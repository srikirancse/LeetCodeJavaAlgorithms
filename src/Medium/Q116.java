package Medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Srikiran Sistla on 4/9/2017.
 */
public class Q116 {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        Queue<TreeLinkNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                if (q.peek().left!=null) q.add(q.peek().left);
                if (q.peek().right!=null) q.add(q.peek().right);
                TreeLinkNode removed = q.poll();
                if (i == qSize -1) removed.next = null;
                else removed.next = q.peek();
            }
        }
    }
}