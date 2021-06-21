package sword.finger.offer;

import org.junit.jupiter.api.Test;

public class Question21 {

    @Test
    public void test() {
        long start = System.currentTimeMillis();
        int[] nums = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            nums[i] = i;
        }
        recordOddEven(nums);
        System.out.println("总耗时:" + (System.currentTimeMillis() - start));
    }

    public int[] recordOddEven(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if ((nums[left] % 2 == 0) && (nums[right] % 2 == 1)) {
                Utils.swap(nums, left, right);
                left++;
                right--;
            }
            if (nums[left] % 2 == 1) {
                left++;
            }
            if (nums[right] % 2 == 0) {
                right--;
            }
            if (right == left) {
                break;
            }
        }
        return nums;
    }

    @Test
    public void test2() {
        long start = System.currentTimeMillis();
        int[] nums = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            nums[i] = i;
        }
        recordOddEven2(nums);
        System.out.println("总耗时:" + (System.currentTimeMillis() - start));
    }

    public int[] recordOddEven2(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 1) {
                left++;
            }
            while (right > left && nums[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                Utils.swap(nums, right, left);
                right--;
                left++;
            }
        }
        return nums;
    }

    @Test
    public void test3() {
        long start = System.currentTimeMillis();
        int[] nums = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            nums[i] = i;
        }
        recordOddEven3(nums);
        System.out.println("总耗时:" + (System.currentTimeMillis() - start));
    }

    public int[] recordOddEven3(int[] nums) {
        int[] newNums = new int[nums.length];
        int end = nums.length - 1;
        int start = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                newNums[end] = num;
                end--;
            } else {
                newNums[start] = num;
                start++;
            }
        }
        return newNums;
    }

}
