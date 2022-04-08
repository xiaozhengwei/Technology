import java.util.*;

/**
 * N叉树的层序遍历
 */
public class Leetcode429 {

    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            if (root == null) {
                return new ArrayList<>();
            }
            List<List<Integer>> results = new ArrayList<>();
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> result = new ArrayList<>();
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node node = queue.poll();
                    result.add(node.val);
                    queue.addAll(node.children);
                }
                results.add(result);
            }
            return results;
        }
    }
}
