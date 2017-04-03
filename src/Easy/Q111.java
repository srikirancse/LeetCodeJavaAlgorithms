package Easy;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Srikiran Sistla on 3/27/2017.
 */
public class Q111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        while (!q.isEmpty()){
            for (int i = 0; i < q.size(); i++) {
                TreeNode parent = q.poll();
                if (parent.left == null && parent.right == null) return level;
                if (parent.left!=null) q.add(parent.left);
                if (parent.right!= null) q.add(parent.right);
            }
            level++;
        }
        return level;
    }
}
