import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Leetcode1190 {

    public static String reverseParentheses(String s) {

        Deque<String> stack = new LinkedList<String>();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                sb.reverse();
                sb.insert(0, stack.pop());
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();

    }

    @Test
    public static void main(String[] args) {
        String s = "a(bcdefghijkl(mno)p)q";
        System.out.println(reverseParentheses(s));

    }

}
