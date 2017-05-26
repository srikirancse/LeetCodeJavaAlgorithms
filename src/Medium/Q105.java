package Medium;

import java.util.HashMap;

/**
 * Created by Srikiran Sistla on 4/24/2017.
 */
public class Q105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) return null;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length-1, 0, preorder.length-1, hm);
    }

    private TreeNode helper(int[] preorder, int is, int ie, int ps, int pe, HashMap<Integer, Integer> hm) {
        if (ps > pe) return null;
        TreeNode root = new TreeNode(preorder[ps]);
        int ri = hm.get(preorder[ps]);
        root.left = helper(preorder, is, ri-1, ps+1, ps-is+ri, hm);
        root.right = helper(preorder, ri+1, ie, ps-is+ri+1, pe, hm);
        return root;
    }
}
