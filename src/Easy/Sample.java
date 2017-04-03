package Easy;

/**
 * Created by Srikiran Sistla on 3/29/2017.
 */
public class Sample {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }


        return getDiameter(root, 0);
    }

    public int getDiameter(TreeNode root, int len) {
        if (root == null) {
            return len;
        }
        int right = getDiameter(root.right, len);
        int left = getDiameter(root.left, len);
        max = Math.max(max, right + left);
        return Math.max(getDiameter(root.left, len), getDiameter(root.right, len))+1;
    }
}
