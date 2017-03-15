package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Srikiran Sistla on 3/4/2017.
 */
public class Q144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                preList.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return preList;
    }
}
