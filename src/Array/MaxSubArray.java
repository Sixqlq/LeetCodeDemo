package Array;

/*
    连续子数组的最大值
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] a = new int[]{5,4,-1,7,8};
        System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums) {
        // 方法一：贪心算法
        int n = nums.length;
        int sum = nums[0];
        int num = nums[0];
        for(int i = 1; i < n; i++){
            if(num < 0){
                num = nums[i];
            }else {
                num = num + nums[i];
            }
            sum = Math.max(sum, num);
        }
        return sum;
    }

    public int maxSubArray2(int[] nums) {
        // 方法二： 动态规划
        int len = nums.length;
        // dp[i]表示：以nums[i]为结尾的连续子数组的最大和
        int[] dp = new int[len];
        dp[0] = nums[0];
        int sum = dp[0];
        for (int i = 1; i < len; i++){
            if(dp[i - 1] <= 0){
                dp[i] = nums[i];
            }else {
                dp[i] = dp[i - 1] + nums[i];
            }
            sum = Math.max(sum, dp[i]);
        }
        return sum;
    }

    public int maxSubArray3(int[] nums) {
        // 方法3： 分治法

        return 0;
    }
}
