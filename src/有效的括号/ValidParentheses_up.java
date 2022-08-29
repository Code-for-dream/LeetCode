package 有效的括号;

import java.util.Stack;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-29 21:18
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 * 示例 1：
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 * 输入：s = "({[]})"  =>  "(){[]}"
 * =>  "({[}])"  => "({[(}]))" => ......   ({)}  [(]) {[}]
 * 输出：true
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParentheses_up {

    /**
     * 是否有效
     *
     * @param s s
     * @return boolean
     */
    public boolean isValid(String s) {
        // 获取长度一半
        int length = s.length() / 2;
        // 循环遍历，进行括号配对替换空值
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "")
                    .replace("{}", "")
                    .replace("[]", "");
        }
        // 返回是否长度为o，全部匹配替换
        return s.length() == 0;
    }

    public static void main(String[] args) {
        String s = "({[(}]))"; // "(}]){[(("
        String result = new ValidParentheses_up().isValid(s) ? s + "是有效的！" : s + "是无效的！";
        System.out.println(result);
        ;
    }
}
