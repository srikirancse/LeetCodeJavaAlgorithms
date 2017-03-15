package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Srikiran Sistla on 2/12/2017.
 */
public class Q515 {
    public int[] findValueMostElement(TreeNode root) {
        if (root == null) return new int[0];
        int max;
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            max = q.peek().val;
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                max = Math.max(max, cur.val);
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            ans.add(max);
        }
        return ans.stream().mapToInt(k->k).toArray();
    }
}
