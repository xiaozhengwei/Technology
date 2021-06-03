package sword.finger.offer;

public class Question15 {


    public static void main(String[] args) {
//        for (int i = 100; i >= 0; i--) {
//            System.out.println(i>>1);
//            System.out.println(i & 1);
//        }


//        System.out.println(7&1);
//        System.out.println(8&1);

//        System.out.println(8&7);
//        System.out.println(7&6);
//        System.out.println(6&5);
//        System.out.println(5&4);
//        System.out.println(4&3);
//        System.out.println(3&2);
//        System.out.println(2&1);


    }

    public static int numberOf1simple(int n) {
        int count = 0;
        int flag = 1;

        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }

        return count;
    }

    private static int numberOf1(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }

}
