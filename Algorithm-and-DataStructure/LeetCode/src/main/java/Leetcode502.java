import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Leetcode502 {

    @Test
    public void run() {

    }

    public class Node {
        public Integer profit;
        public Integer capital;
        public boolean isUsed;

        public Node(int profit, int capital) {
            this.capital = capital;
            this.profit = profit;
            this.isUsed = false;

        }

    }
    static class Solution {
        public class Node {
            public Integer profit;
            public Integer capital;
            public boolean isUsed;

            public Node(int profit, int capital) {
                this.capital = capital;
                this.profit = profit;
                this.isUsed = false;

            }

        }

        public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
            int projectCount = profits.length;
            Set<Node> set = new TreeSet<>(new Comparator<Node>() {
                @Override
                public int compare(Node node1, Node node2) {
                    if (node1.profit.equals(node2.profit)) {
                        return node1.capital.compareTo(node2.capital);
                    } else
                        return node2.profit.compareTo(node1.profit);
                }
            });
            for (int i = 0; i < projectCount; i++) {
                set.add(new Node(profits[i], capital[i]));
            }

            for (int i = 0; i < k; i++) {
                for (Node node : set) {
                    if (w >= node.capital && !node.isUsed) {
                        w = w + node.profit;
                        node.isUsed = true;
                        break;
                    }
                }
            }
            return w;
        }
    }

}
