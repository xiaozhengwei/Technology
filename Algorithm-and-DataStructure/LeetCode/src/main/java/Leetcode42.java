import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Leetcode42 {

    @Test
    public void run() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution solution = new Solution();
        solution.trap(height);
    }

    class Solution {

        // 双指针
        public int trap(int[] height) {
            int result = 0;
            int left = 0;
            int right = height.length - 1;
            int leftMax = 0;
            int rightMax = 0;
            while (left < right) {
                leftMax = Math.max(leftMax, height[left]);
                rightMax = Math.max(rightMax, height[right]);
                if (height[left] < height[right]) {
                    result += leftMax - height[left];
                    left++;
                } else {
                    result += rightMax - height[right];
                    right--;
                }
            }
            return result;
        }

//        // 单调递减栈
//        public int trap(int[] height) {
//            Stack<Integer> stack=new Stack<>();
//            int result=0;
//            for(int i=0;i<height.length;i++){
//                while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
//                    int top=stack.pop();
//                    if(stack.isEmpty()){
//                        break;
//                    }
//                    int left=stack.peek();
//                    int weight=i-left-1;
//                    int along=Math.min(height[i],height[left])-top;
//                    result+=along*weight;
//                }
//                stack.add(i);
//            }
//            return result;
//        }


//        //使用dp实现
//        public int trap(int[] height) {
//            int length=height.length;
//            int []leftMaxNums=new int[length];
//            int []rightMaxNums=new int[length];
//            int leftMax=height[0];
//            int rightMax=height[length-1];
//            for(int i=0;i<length;i++){
//                int num=height[i];
//                if(num<=leftMax){
//                    leftMaxNums[i]=leftMax;
//                }else{
//                    leftMaxNums[i]=height[i];
//                    leftMax=height[i];
//                }
//            }
//
//            for(int i=length-1;i>=0;i--){
//                int num=height[i];
//                if(num<=rightMax){
//                    rightMaxNums[i]=rightMax;
//                }else{
//                    rightMaxNums[i]=height[i];
//                    rightMax=height[i];
//                }
//            }
//            int result=0;
//
//            for(int i=0;i<length;i++){
//                result=result+(Math.min(rightMaxNums[i],leftMaxNums[i])-height[i]);
//            }
//            return result;
//        }
    }
}
