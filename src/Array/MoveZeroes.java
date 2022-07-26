package Array;

/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
请注意，必须在不复制数组的情况下原地对数组进行操作。

示例 1:

输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]
示例 2:

输入: nums = [0]
输出: [0]

 */
public class MoveZeroes {
    /**
     * 暴力解法：对于每个为0的数都与其后面第一个不为0的数字交换，时间复杂度：O(n2)
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < len; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    /**
     * 新建数组遍历原数组非0数字且存储，新数组即为目标数组
     * 时间复杂度：O(n) 空间复杂度：O(n)
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        int len = nums.length;
        int[] newNums = new int[len];
        for (int i = 0, j = 0; i < len && j < len; i++) {
            if (nums[i] != 0) {
                newNums[j++] = nums[i];
            }
        }
        for (int i = 0; i < len; i++) {
            nums[i] = newNums[i];
        }
    }

    /**
     * 双指针: 右指针依次遍历数组，遇到非0的数字停下来与左指针所指的0交换，左指针的左边都是交换过的数字
     * 左指针与右指针中间都是0，右指针的右边都是未筛查的数字
     * @param nums
     */
    public void moveZeroes3(int[] nums) {
        int len = nums.length, left = 0, right = 0;
        while(right < len) {
            if(nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}
