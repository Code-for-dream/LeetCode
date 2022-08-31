package 合并两个有序链表;

import java.util.Arrays;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-31 15:34
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 示例 1：
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class MergeTwoLinks {

    /**
     * 合并两个列表
     * 思路:
     *  我们可以用迭代的方法来实现上述算法。当 l1 和 l2 都不是空链表时，判断 l1 和 l2 哪一个链表的头节点的值更小，将较小值的节点添加到结果里，
     *  当一个节点被添加到结果里之后，将对应链表中的节点向后移一位。
     *
     * 算法:
     *  首先，我们设定一个哨兵节点 prehead ，这可以在最后让我们比较容易地返回合并后的链表。我们维护一个 curr 指针，我们需要做的是调整它的 next 指针。
     *  然后，我们重复以下过程，直到 l1 或者 l2 指向了 null ：
     *      如果 l1 当前节点的值小于等于 l2 ，我们就把 l1 当前的节点接在 curr 节点的后面同时将 l1 指针往后移一位。
     *      否则，我们对 l2 做同样的操作。不
     *      管我们将哪一个元素接在了后面，我们都需要把 curr 向后移一位。
     *  在循环终止的时候， l1 和 l2 至多有一个是非空的。
     *  由于输入的两个链表都是有序的，所以不管哪个链表是非空的，它包含的所有元素都比前面已经合并链表中的所有元素都要大。
     *  这意味着我们只需要简单地将非空链表接在合并链表的后面，并返回合并链表即可。
     *

     * @param list1 list1
     * @param list2 用于
     * @return {@link ListNode}
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode prehead = new ListNode(0);
        ListNode curr = prehead;

        while (list1 != null && list2 != null){
            if (list1.val <= list2.val ) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            } else {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (list1 == null) {
            curr.next = list2;
        } else {
            curr.next = list1;
        }
        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode result = new MergeTwoLinks().mergeTwoLists(list1,list2);
        System.out.println(result.toString());
    }
}

