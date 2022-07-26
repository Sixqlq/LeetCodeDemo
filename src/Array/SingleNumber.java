package Array;
/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
示例 1:

输入: [2,2,1]
输出: 1

示例 2:

输入: [4,1,2,1,2]
输出: 4
 */


import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    /**
     * 异或运算
     * 1.交换律：a^b^c = a^c^b
     * 2.任何数与0异或为任何数 0^n = n
     * 3.相同的数异或为0 n^n=0
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int i = 0; i < nums.length; i++){
            single ^= nums[i];
        }
        return single;
    }

    /**
     * 哈希暴力法，所有整数放进map，用value来筛选出值为1的整数
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums){
            if(hashMap.get(num) == null){
                hashMap.put(num, 1);
            }else{
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }

        for(Integer key: hashMap.keySet()){
            if (hashMap.get(key) == 1){
                return key;
            }
        }
        return -1; // 找不到目标
    }
}
