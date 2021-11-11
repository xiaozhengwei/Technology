import org.junit.jupiter.api.Test;

public class Leetcode1646 {


    static class Solution {
        public int getMaximumGenerated(int n) {
            if(n==0)
                return 0;
            if(n==1){
                return 1;
            }
            int []dp=new int[n+1];
            dp[0]=0;
            dp[1]=1;
            int max=1;
            int start=2;
            while(start<=n){
                if(start%2==0){
                    dp[start]=dp[start/2];
                }else{
                    dp[start]=dp[start/2]+dp[start/2+1];
                }
                if(dp[start]>max){
                    max=dp[start];
                }
                start++;
            }

            return max;
        }
    }

    @Test
    public void run(){
        Solution solution=new Solution();
        System.out.println(solution.getMaximumGenerated(7));
    }
}
