import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Leetcode20 {

    @Test
    public void run(){
        String s="]";
        Solution solution=new Solution();
        System.out.println(solution.isValid(s));
    }


    class Solution {
        public boolean isValid(String s) {
            char[] chars = s.toCharArray();
            Stack<Character> stack = new Stack();
            for (char c : chars) {
                if (c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                }
                if (c == '}' || c == ')' || c == ']') {
                    if(stack.isEmpty()){
                        return false;
                    }
                    char temp = stack.pop();
                    if ((c == '}' && temp == '{') || (c == ')' && temp == '(') || (c == ']' && temp == '[')) {
                    } else {
                        return false;
                    }
                }
            }


            if (stack.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
