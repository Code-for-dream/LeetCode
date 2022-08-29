package 有效的括号;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-29 23:48
 */
public class tool_replace {
    public static void main(String[] args) {

        String s1 = "(){}[]"; // 6
        String s2 = "(){[]}";  // 5
        String s3 = "({(}))"; // 6

        /*System.out.println(s1.replace("()","")); // ({[)
        System.out.println(s2.replace("()","")); // ((]))
        System.out.println(s3.replace("()","")); // ({(}))*/

        int length = s2.length() / 2;
        // 循环消除
        for (int i = 0; i < length; i++) {
            System.out.println("\n第" + i + "次：");
            s2 = s2.replace("()", "");
            System.out.println(s2);
            s2 = s2.replace("{}", "");
            System.out.println(s2);
            s2 = s2.replace("[]", "");
            System.out.println(s2);
        }

        /* s2 = "(){[]}"  先替换{} => 然后替换[] => 最后替换{}  类似于消消乐，消除后总会有新的配对括号产生！！！
        第0次：
        {[]}
        {[]}
        {}

        第1次：
        {}



        第2次：



        */


    }
}
