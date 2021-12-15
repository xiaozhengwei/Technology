import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {

    @Test
    public void run(){

    }

    static class Solution {

       public static List<List<Integer>>  results = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {

            for(int i=0;i<nums.length;i++){
                List<Integer> result=new ArrayList<>();
                result.add(nums[i]);
            }

            return results;
        }


        public void create(List<Integer> result,int []nums,int start,int end,int length){
            if(result.size()==nums.length){
                results.add(result);
                return;
            }

        }
    }
}
