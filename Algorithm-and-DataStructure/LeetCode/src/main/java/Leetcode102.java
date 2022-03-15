import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode102 {
    @Test
    public void run() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        Solution solution = new Solution();
        solution.levelOrder(treeNode);
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> results = new ArrayList<>();
            if (root == null) {
                return results;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int currentLevel = queue.size();
                List<Integer> result = new ArrayList<>();
                for (int i = 0; i < currentLevel; i++) {
                    TreeNode node = queue.poll();
                    result.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                results.add(result);
            }
            return results;
        }

//    // 递归实现
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root != null) {
//            addLevels(result, root, 0);
//        }
//        return result;
//    }
//
//
//    public void addLevels(List<List<Integer>> results, TreeNode node, int level) {
//        if (results.size() == level) {
//            results.add(new ArrayList<>());
//        }
//        results.get(level).add(node.val);
//        if (node.left != null) {
//            addLevels(results, node.left, level + 1);
//        }
//        if (node.right != null) {
//            addLevels(results, node.right, level + 1);
//        }
//    }
    }
}
