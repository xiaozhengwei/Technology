package quicksort;

public class QuickSort {

    /**
     * 获取基准元素的下标。
     *
     * @param array 待排序的数组
     * @param left  起点索引
     * @param right 终点索引
     * @return
     */
    public static int partition(int[] array, int left, int right) {
        int num = array[left];
        int index = left;

        for (int i = index + 1; i <= right; i++) {
            if (array[i] < num) {
                index++;
                swap(array, i, index);
            }

        }
        if (index != left) {
            array[left] = array[index];
            array[index] = num;
        }

        return index;
    }

    /**
     * 数组中，交换两个元素的位置
     */
    private static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }


    private static void quickSort(int[] array, int left, int right) {
        if (left == right)
            return;

        int index = partition(array, left, right);


        if (index > left) {
            quickSort(array, left, index - 1);
        }

        if (index < right) {
            quickSort(array, index + 1, right);
        }


    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 7, 4, 2, 6};
        quickSort(array, 0, 6);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }


}
