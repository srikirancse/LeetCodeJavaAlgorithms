package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Srikiran Sistla on 4/9/2017.
 */
public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        q.add(root);
        while (!q.isEmpty()){
            int qSize = q.size();
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < qSize; i++) {
                TreeNode tempNode = q.poll();
                if (tempNode.left!=null) q.add(tempNode.left);
                if (tempNode.right!=null) q.add(tempNode.right);
                tempList.add(tempNode.val);
            }
            res.add(tempList);
        }
        return res;
    }
}