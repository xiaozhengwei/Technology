package sword.finger.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question7 {

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length>3){
            Arrays.sort(nums);
            int i=0;
            while(i<nums.length-2){
                twoSum(nums,i,result);
                int temp=nums[i];
                while(i<nums.length&&nums[i]==temp){
                    i++;
                }
            }
        }
        return result;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> result) {
        int j=i+1;
        int k=nums.length-1;
        while (j<k){
            if(nums[i]+nums[j]+nums[k]==0){
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                int temp=nums[j];
                while (nums[j]==temp&&j<k){
                    j++;
                }
            }else if(nums[i]+nums[j]+nums[k]<0){
                j++;
            }else {
                k--;
            }
        }
    }
}
