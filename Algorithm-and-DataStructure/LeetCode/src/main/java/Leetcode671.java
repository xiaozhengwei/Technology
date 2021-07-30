import org.junit.jupiter.api.Test;

public class Leetcode671 {

    public int findSecondMinimumValue(TreeNode root) {
        int[] arr = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return -1;
        }
        arr[1] = root.val;
        findInTree(root, arr);
        return arr[0];

    }

    public void findInTree(TreeNode root, int[] arr) {
        if (root != null) {
            swap(arr,root.val);
            if (root.left != null) {
                findInTree(root.left, arr);
            }
            if (root.right != null) {
                findInTree(root.right, arr);
            }
        }
    }

    public void swap(int[] arr, int value) {

        if (arr[1] >= value) {
            arr[0] = arr[1];
            arr[1] = value;

        } else if (arr[0] >= value) {
            arr[0] = value;
        }
    }

    @Test
    public void run() {
    }
}
