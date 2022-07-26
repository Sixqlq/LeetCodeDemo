package Array;

/*
给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
示例 1：

输入：nums = [3,0,1]
输出：2
解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
示例 2：

输入：nums = [0,1]
输出：2
解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中

进阶：你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 */
public class MissingNumber {
    /**
     * 位运算：时间复杂度O(n)  空间复杂度O(1)
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++) {
            res ^= nums[i] ^ (i + 1);
        }
        return res;
    }

    /**
     * 数学求解：0-n 之间的所有数字和为 n*（n+1）/2, 去掉原数组所有数字和即为缺失的数字
     * @param nums
     * @return
     */
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n + 1)/2;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += nums[i];
        }
        return totalSum - arrSum;
    }
}
