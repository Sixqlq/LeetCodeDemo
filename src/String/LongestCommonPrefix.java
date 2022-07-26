package String;
/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1：

输入：strs = ["flower","flow","flight"]
输出："fl"
示例 2：

输入：strs = ["dog","racecar","car"]
输出：""
解释：输入不存在公共前缀。

 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String res = strs[0];
        for (int i = 1; i < n; i++) {
            int j = 0;
            for(; j < res.length() && j < strs[i].length(); j++) {
                if(res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, j);
            if(res.equals("")) {
                return res;
            }
        }
        return res;
    }
}
