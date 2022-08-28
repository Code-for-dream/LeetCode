package 最长公共前缀;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-28 14:36
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * <p>
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 * <p>
 * 提示：
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        // 公共前缀最长不超过最短的字符串,假设第一个为前缀
        String prefix = strs[0];
        // 遍历字符串元素
        for (String str : strs) {
            // 如果前缀长度为0
            if (prefix.length() == 0) return "";
            // 如果不是前缀一直循环
            while (!str.startsWith(prefix)) {
                // 每次前移一位
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"dog", "racecar", "car"};
        String prefix = new LongPrefix().longestCommonPrefix(strs);
        System.out.println(prefix.equals("") ? "不存在公共前缀。" : "最长公共前缀是：" + prefix);
    }
}
