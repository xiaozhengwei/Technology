import org.junit.jupiter.api.Test;

public class Leetcode437 {

    @Test
    public void run() {

    }

    static class Solution {
        public int pathSum(TreeNode root, int targetSum) {

            if (root == null) {
                return 0;
            }

            int count = 0;

            count += rootSum(root, targetSum);
            count += pathSum(root.left, targetSum);
            count += pathSum(root.right, targetSum);

            return count;
        }

        public int rootSum(TreeNode root, int targetSum) {

            int count=0;

            if(root==null){
                return 0;
            }

            if(root.val==targetSum){
                count++;
            }

            count+=rootSum(root.left,targetSum-root.val);

            count+=rootSum(root.right,targetSum-root.val);

            return count;

        }
    }

}
