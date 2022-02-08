public class Leetcode14 {

    class Solution {

        public String longestCommonPrefix(String[] strs) {
            int length = strs.length;
            if (length < 1) {
                return null;
            }
            if (length == 1) {
                return strs[0];
            }
            int start = 0;
            int end = 0;
            char base = ' ';
            for(int i=0;i<strs[0].length();i++){
                for(int j=0;j<length;j++){
                    if(j==0){
                        base=strs[j].charAt(i);
                    }else {
                        if(strs[j].length()<=i||base!=strs[j].charAt(i)){
                            break;
                        }
                    }
                }
            }
            return strs[0].substring(start, end);
        }
        
    }
}
