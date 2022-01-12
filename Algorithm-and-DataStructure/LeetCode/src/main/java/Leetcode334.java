import org.junit.jupiter.api.Test;

public class Leetcode334 {

    @Test
    public void run() {
        Solution solution=new Solution();
        int []nums={4,5,4,3,4,2,1,4,3};
        solution.increasingTriplet(nums);
    }

    class Solution {
        public boolean increasingTriplet(int[] nums) {
            int length=nums.length;
            if(length<3){
                return false;
            }
            int first=nums[0];
            int second=Integer.MAX_VALUE;

            for(int i=1;i<length;i++){
                int temp=nums[i];
                if(temp>second){
                    return true;
                }else if(temp>first){
                    second=temp;
                }else {
                    first=temp;
                }
            }
            return false;
        }
    }
}
