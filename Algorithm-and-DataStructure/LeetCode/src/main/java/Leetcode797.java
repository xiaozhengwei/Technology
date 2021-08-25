import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leetcode797 {

    @Test
    public void run() {

    }

    class Solution {

        List<List<Integer>> answer = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();

        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            stack.offerLast(0);
            dfs(graph, 0, graph.length - 1);
            return answer;
        }

        public void dfs(int[][] graph, int x, int n) {
            if (x == n) {
                answer.add(new ArrayList<>(stack));
                return;
            }
            for (int y : graph[x]) {
                stack.offerLast(y);
                dfs(graph, y, n);
                stack.pollLast();
            }
        }
    }
}
