package 罗马数转整数;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-26 22:02
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，
 * 例如 4 不写做 IIII，而是 IV。
 * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RomanNumber {
    public int romanToInt(String s) {
        // hashmap存储配对值
        Map<Character, Integer> str_num = new HashMap<>();
        str_num.put('I', 1);
        str_num.put('V', 5);
        str_num.put('X', 10);
        str_num.put('L', 50);
        str_num.put('C', 100);
        str_num.put('D', 500);
        str_num.put('M', 1000);
        // 存储最后结果
        int result = 0;
        // 遍历
        for (int i = 0; i < s.length(); i++) {
            // 输出对应位置转换值
            System.out.println(str_num.get(s.charAt(i)));
            if (i + 1 >= s.length()) {
                // 已经是最后一位直接加上
                result += str_num.get(s.charAt(i));
            } else if (str_num.get(s.charAt(i)) >= str_num.get(s.charAt(i + 1))) {
                // 如果当前字符代表的值不小于其右边，就加上该值
                result += str_num.get(s.charAt(i));
            } else {
                // 如果当前字符代表的值小于其右边，就减去该值
                result -= str_num.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = new RomanNumber().romanToInt(s);
        System.out.println("转换结果为：" + result);
    }
}
