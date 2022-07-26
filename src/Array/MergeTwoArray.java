package Array;

/*
    合并两个有序数组，将2数组合并到1数组，1数组的长度是2个数组长度之和
 */
public class MergeTwoArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m - 1;
        int l2 = n - 1;
        int p = m + n - 1;
        while(l1 >= 0 && l2 >= 0){
            nums1[p--] = nums1[l1] > nums2[l2] ? nums1[l1--] : nums2[l2--];
        }
        while(l2 >= 0){
            nums1[p--] = nums2[l2--];
        }
    }
}
