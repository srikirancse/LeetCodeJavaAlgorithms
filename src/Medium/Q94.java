package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Srikiran Sistla on 3/4/2017.
 */



public class Q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}

