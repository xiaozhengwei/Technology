import org.junit.jupiter.api.Test;

public class Leetcode97 {

    @Test
    public void run() {
        Solution solution=new Solution();
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        solution.isInterleave(s1,s2,s3);

    }

    static class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {
            if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) {
                return true;
            }

            if (s1.length() + s2.length() != s3.length()) {
                return false;
            }
            int s1Index=0;
            int s2Index=0;
            int s3Index=0;
            char []s1CharArray= s1.toCharArray();
            char []s2CharArray= s2.toCharArray();
            char []s3CharArray= s3.toCharArray();

            while (s3Index<s3.length()){

                char s3Char=s3CharArray[s3Index];

                if(s1Index<s1.length()&&s3Char==s1CharArray[s1Index]){
                    s1Index++;
                    s3Index++;
                }else if(s2Index<s2.length()&&s3Char==s2CharArray[s2Index]){
                    s2Index++;
                    s3Index++;
                }else {
                    return false;
                }
            }
            return true;
        }
    }
}
