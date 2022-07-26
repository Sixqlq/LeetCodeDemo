package Array;
/*
    给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于n/2的元素
 */

public class MajorityElement {

    /**
     * 摩尔投票法
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count+= (candidate == num) ? 1:-1;
        }
        return candidate;
    }
}
