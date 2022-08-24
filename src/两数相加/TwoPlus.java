package 两数相加;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-23 23:16
 */
class ListNode {
    int val;
    ListNode next;

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

public class TwoPlus {
    /**
     * 两个数代表两个链表
     * @param l1 一条链表的节点头（指针一）
     * @param l2 另一条链表的节点头（指针二）
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 头节点（结果链表的开始）
        ListNode pre = new ListNode(0);

        // 当前位置节点(指针)【从左往右依次计算，同时存储计算的结果】
        ListNode cur = pre;

        // 进位值
        int carry = 0;

        // 当两个节点不为空时
        while(l1 != null || l2 != null) {
            // 判断给头节点是否为空
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            // 计算对应为的结果 （包含进位值）
            int sum = x + y + carry;
            // 重新计算进位值
            carry = sum / 10;
            // 算出当前位的值
            sum = sum % 10;
            // 存储对应位上的值
            cur.next = new ListNode(sum);
            // 进入下一位计算
            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }

        // 如果进位数不为0
        if(carry != 0) {
            // 新建节点存储
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(5,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode result = new TwoPlus().addTwoNumbers(l1,l2);
        System.out.println(result.toString()); // ListNode{val=7, next=ListNode{val=1, next=ListNode{val=8, next=null}}}
    }
}
