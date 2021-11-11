import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class Leetcode575 {

    @Test
    public void run(){

    }

    static class Solution {
        public int distributeCandies(int[] candyType) {
            Set<Integer> set=new HashSet<>();
            for(int ct:candyType){
                set.add(ct);
            }
            return Math.max(candyType.length / 2, set.size());
        }
    }
}
