import org.junit.jupiter.api.Test;

public class Leetcode165 {

    @Test
    public void run() {

    }


    class Solution {
//        public int compareVersion(String version1, String version2) {
//            String []v1s=version1.split("\\.");
//            String []v2s=version2.split("\\.");
//
//            for(int i=0;i<v1s.length||i<v2s.length;i++){
//                int x=0;
//                int y=0;
//                if(i<v1s.length){
//                    x=Integer.parseInt(v1s[i]);
//                }
//                if(i<v2s.length){
//                    y=Integer.parseInt(v2s[i]);
//                }
//                if(x<y){
//                    return -1;
//                }
//                if(x>y){
//                    return 1;
//                }
//            }
//            return 0;
//        }
//    }

        public int compareVersion(String version1, String version2) {
            int n = version1.length(), m = version2.length();
            int i = 0, j = 0;
            while (i < n || j < m) {
                int x = 0;
                for (; i < n && version1.charAt(i) != '.'; ++i) {
                    x = x * 10 + version1.charAt(i) - '0';
                }
                ++i; // 跳过点号
                int y = 0;
                for (; j < m && version2.charAt(j) != '.'; ++j) {
                    y = y * 10 + version2.charAt(j) - '0';
                }
                ++j; // 跳过点号
                if (x != y) {
                    return x > y ? 1 : -1;
                }
            }
            return 0;
        }
    }
}
