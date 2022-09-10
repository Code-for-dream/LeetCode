package 二进制求和;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-09-09 10:03
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *   输入: a = "11", b = "1"
 *   输出: "100"
 * 示例 2:
 *   输入: a = "1010", b = "1011"
 *   输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class TwoSum {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            if(i >= 0) c += a.charAt(i --) - '0';
            if(j >= 0) c += b.charAt(j --) - '0';
            stb.append(c % 2);
            c >>= 1;
        }

        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String result = new TwoSum().addBinary(a,b);
        System.out.println(result);
    }
}
