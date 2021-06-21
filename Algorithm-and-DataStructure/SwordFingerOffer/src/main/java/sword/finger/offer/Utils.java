package sword.finger.offer;

public class Utils {
    /**
     * 数组中，交换两个元素的位置
     */
    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }
}
