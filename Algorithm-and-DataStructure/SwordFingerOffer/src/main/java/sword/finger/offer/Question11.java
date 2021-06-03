package sword.finger.offer;

public class Question11 {


    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 2, 3, 4, 5,};
        // int []arr={1,0,1,1,1};
        // int []arr={1,1,1,0,1};
        System.out.println(searchMin(arr));

    }

    // 仅针对于不重复的数组
    private static int searchMin(int[] array) {

        int low = 0;
        int high = array.length - 1;

        int mid = low;

        // 进入循环说明,数组为:[2,3,4,5,6,7,1] 这样的形式
        // 就是说肯定不是从小到大的数组
        while (array[low] > array[high]) {
            // 如果low比high大,而且他俩相差1
            // 则代表 arr[high]就是最小的数
            if (high - low == 1) {
                return array[high];
            }
            // 取中间的坐标
            mid = (low + high) / 2;

            if (array[low] == array[high] && array[low] == array[mid])
                return minInOrder(array, low, high);

            if (array[mid] >= array[low])
                low = mid;
            else if (array[mid] <= array[high]) {
                high = mid;
            }
        }

        return array[mid];

    }


    private static int minInOrder(int[] array, int low, int high) {

        int result = array[low];

        for (int i = low + 1; i <= high; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;

    }
}
