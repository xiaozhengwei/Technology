import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode94 {

    @Test
    public void run() {

    }

    class Solution {

        public List<Integer> inorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            List<Integer> result = new ArrayList<>();
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
            return result;
        }

//        public List<Integer> inorderTraversal(TreeNode root) {
//            List<Integer> result = new ArrayList<>();
//            find(root, result);
//            return result;
//        }
//
//        public void find(TreeNode node, List<Integer> result) {
//            if (node != null) {
//                if (node.left != null) {
//                    find(node.left, result);
//                }
//                result.add(node.val);
//                if (node.right != null) {
//                    find(node.right, result);
//                }
//            }
//        }
    }
}
