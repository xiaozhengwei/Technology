import org.junit.jupiter.api.Test;

public class SFOII55 {

    @Test
    public void demo() {

    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            return treeDepth(root) >= 0;
        }

        public int treeDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = treeDepth(node.left);
            int right = treeDepth(node.right);

            if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
                return -1;
            } else {
                return Math.max(left, right) + 1;
            }
        }


//        // 自顶向下递归
//        public boolean isBalanced(TreeNode root) {
//            if (root == null) {
//                return true;
//            }
//            return Math.abs(treeDepth(root.right) - treeDepth(root.left)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//        }
//
//        public int treeDepth(TreeNode root) {
//            if (root == null) {
//                return 0;
//            }
//            return Math.max(treeDepth(root.left), treeDepth(root.right)) + 1;
//        }
    }
}
