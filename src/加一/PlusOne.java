package 加一;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-09-08 22:56
 * <p>
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 *  
 * 示例 1：
 *   输入：digits = [1,2,3]
 *   输出：[1,2,4]
 *  解释：输入数组表示数字 123。
 * 示例 2：
 *   输入：digits = [4,3,2,1]
 *   输出：[4,3,2,2]
 *  解释：输入数组表示数字 4321。
 * 示例 3：
 *   输入：digits = [0]
 *   输出：[1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        //两种情况
        // 1.正常情况,遇见不是9的
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            //2.如果是9,那么就需要进位,让当前元素为0,转到下一位+1
            digits[i] = 0;
        }
        //3.如果全是9,则直接增加长度,让第一个为1即可
        int[] plusone = new int[digits.length + 1];
        plusone[0] = 1;
        return plusone;
    }
}
