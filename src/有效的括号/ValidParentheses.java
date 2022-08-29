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
public class ValidParentheses {

    /**
     * 是否有效
     *
     * @param s s
     * @return boolean
     */
    public boolean isValid(String s) {
        // 定义一个栈
        Stack<Character> stack = new Stack<Character>();
        // 遍历循环字符数组（字串转为字符数组）
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[(}]))"; // "(}]){[(("
        String result = new ValidParentheses().isValid(s) ? s + "是有效的！" : s + "是无效的！";
        System.out.println(result);
        ;
    }
}
