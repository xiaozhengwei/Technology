import java.util.ArrayList;
import java.util.List;

public class Leetcode94 {

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            find(root, result);
            return result;
        }

        public void find(TreeNode node, List<Integer> result) {
            if (node != null) {
                if (node.left != null) {
                    find(node.left, result);
                }
                result.add(node.val);
                if (node.right != null) {
                    find(node.right, result);
                }
            }
        }
    }
}
