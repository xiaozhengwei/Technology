import org.junit.jupiter.api.Test;

public class LeetcodeIsUniqueLcci {
    @Test
    public void run() {

    }

    class Solution {
        public boolean isUnique(String astr) {
            int []chars=new int[26];
            for(char c:astr.toCharArray()){
                if(chars[c-'a']==1){
                    return false;
                }else {
                    chars[c-'a']=1;
                }
            }
            return true;
        }
    }
}
