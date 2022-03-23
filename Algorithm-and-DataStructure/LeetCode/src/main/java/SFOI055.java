import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class SFOI055 {

    @Test
    public void demo() {

    }


    class Solution {

        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int result = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Queue<TreeNode> temp = new LinkedList<>();
                for (TreeNode node : queue) {
                    if (node.left != null) {
                        temp.add(node.left);
                    }
                    if (node.right != null) {
                        temp.add(node.right);
                    }
                }
                queue = temp;
                result++;
            }
            return result;
        }

//    //后序遍历DFS
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = maxDepth(root.left) + 1;
//        int right = maxDepth(root.right) + 1;
//        return Math.max(left, right);
//    }
    }

}
