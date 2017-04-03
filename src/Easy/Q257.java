package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Srikiran Sistla on 3/20/2017.
 */
public class Q257 {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return res;
        String s = "";
        binaryTreePathBuilder(root, 0, s);
        return res;
    }

    private void binaryTreePathBuilder(TreeNode root, int i, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null){
            res.add(s.isEmpty()? s.concat(root.val+"") : s.concat("->"+root.val));
            return;
        }
        binaryTreePathBuilder(root.left, i, s.isEmpty()? s.concat(root.val+"") : s.concat("->"+root.val));
        binaryTreePathBuilder(root.right, i+1, s.isEmpty()? s.concat(root.val+"") : s.concat("->"+root.val));
    }
}
