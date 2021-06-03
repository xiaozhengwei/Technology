package sword.finger.offer;

public class Question14 {

    private static int maxProductAfterCuttingByDP(int n) {

        if (n <= 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        if (n == 3) {
            return 2;
        }

        int[] maxValues = new int[n + 1];

        maxValues[0] = 0;
        maxValues[1] = 1;
        maxValues[2] = 2;
        maxValues[3] = 3;

        int max = 0;

        for (int i = 4; i <= n; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int maxValue = maxValues[j] * maxValues[i - j];
                if (maxValue > max) {
                    max = maxValue;
                }
            }
            maxValues[i] = max;
        }

        return maxValues[n];
    }

    private static int maxProductAfterCuttingByGA(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int count3 = n / 3;
        if (n - count3 * 3 == 1) {
            count3--;
        }

        int count2 = (n - count3 * 3) / 2;


        return (int) (Math.pow(3, count3) * Math.pow(2, count2));

    }

    public static void main(String[] args) {
        System.out.println(maxProductAfterCuttingByDP(15));

        System.out.println(maxProductAfterCuttingByDP(8));

        System.out.println(maxProductAfterCuttingByGA(15));

        System.out.println(maxProductAfterCuttingByGA(8));
    }

}
