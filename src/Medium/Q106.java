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
        return helper(postorder, 0,postorder.length-1, hm);
    }

    private TreeNode helper(int[] postorder, int is, int pe,  HashMap<Integer, Integer> hm) {
        if (pe < 0) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int ri = hm.get(postorder[pe]);
        root.left = helper(postorder, is, ri-1, hm);
        root.right = helper(postorder, ri+1, pe-1, hm);
        return root;
    }
}
