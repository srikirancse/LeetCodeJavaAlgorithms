package Medium;

import java.util.HashMap;

/**
 * Created by Srikiran Sistla on 4/19/2017.
 * Construct a binary tree from post order and inorder
 */
public class Q106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) return null;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }
        return helper(0, postorder, 0, postorder.length-1, hm);
    }

    private TreeNode helper(int is, int[] postorder, int ps, int pe, HashMap<Integer, Integer> hm) {
        if (ps>pe) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int ri = hm.get(postorder[pe]);
        root.left = helper(is, postorder, ps, ps+ri-is-1, hm);
        root.right = helper(ri+1, postorder, ps+ri-is, pe-1, hm);
        return root;
    }
}
