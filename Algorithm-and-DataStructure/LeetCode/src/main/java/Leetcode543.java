public class Leetcode543 {


    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            int leftLength = 0, rightLength = 0;
            if (root.left != null) {
                leftLength = run(root.left);
            }
            if (root.right != null) {
                rightLength = run(root.right);
            }
            return leftLength + rightLength;
        }

        public int run(TreeNode root) {
            int leftLength = 0, rightLength = 0;
            if (root.left != null) {
                leftLength = run(root.left)+1;
            }
            if (root.right != null) {
                rightLength = run(root.right)+1;
            }
            return Math.max(leftLength, rightLength);
        }
    }
}
