package headsort;

import org.junit.jupiter.api.Test;

public class HeapSort {
    @Test
    public void run() {
        HeapSort heapSort = new HeapSort();
        int[] nums = {0, 5, 6, 8, 3, 4, 5, 6, 7, 8, 9, 1};
        heapSort.heapSort(nums, nums.length-1);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }

    public void heapSort(int[] nums, int n) {
        int k = n;
        buildHeap(nums, n);
        while (k > 1) {
            swap(nums, 1, k);
            --k;
            heapify(nums, k, 1);
        }
    }



    public void buildHeap(int[] nums, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(nums, n, i);
        }
    }

    public void heapify(int[] nums, int n, int i) {
        while (true) {
            int maxPos = i;
            if (i * 2 < n && nums[i] < nums[i * 2]) {
                maxPos = i * 2;
            }
            if (i * 2 + 1 < n && nums[maxPos] < nums[i * 2 + 1]) {
                maxPos = i * 2 + 1;
            }
            if (maxPos == i) {
                break;
            }
            swap(nums, i, maxPos);
            i = maxPos;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
