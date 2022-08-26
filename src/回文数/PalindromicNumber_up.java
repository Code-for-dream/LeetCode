package 回文数;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-25 15:19
 * <p>
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 例如，121 是回文，而 123 不是。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PalindromicNumber_up {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            System.out.println("负数不是回文数！");
            return false;
        } else if (x == 0) {
            System.out.println("0是回文数！");
            return true;
        } else {
            String str = String.valueOf(x);
            if (str.equals(new StringBuffer(str).reverse().toString())) {
                System.out.println(str + "是回文数！");
                return true;
            } else {
                System.out.println(str + "不是回文数！");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        new PalindromicNumber_up().isPalindrome(123321);
    }
}
