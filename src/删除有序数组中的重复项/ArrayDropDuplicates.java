package 删除有序数组中的重复项;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-31 20:48
 * <p>
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 * 将最终结果插入 nums 的前 k 个位置后返回 k 。
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ArrayDropDuplicates {
    public static int removeDuplicates(int[] nums) {
        //  特例
        if (nums == null) return 0;
        if (nums.length == 1) {
            return nums.length;
        }
        // 使用双指针 => i指向当前数下标(同时记录去重数组的大小)
        //          => j指向当前数后一位的下标
        int i = 0, j = 1;
        // 遍历循环
        while (j < nums.length) {
            // 如果两数不相同
            if (nums[i] != nums[j]) {
                i++; // 指针后移（同时去重数组大小加1）
                nums[i] = nums[j]; // 赋值
            }
            j++;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int all = ArrayDropDuplicates.removeDuplicates(nums);
        for (int i = 0; i < all; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

/*
* public int removeDuplicates(int[] nums) {
        // 用双指针，贼快，只是时间复杂度和空间复杂度有点拉跨
        // 定义左指针和右指针
        // 左指针为0
        // 右指针为1
        int left = 0;
        int right = 1;
        // 遍历数组中的每个数
        // 如果当前数等于left指针指向的数，继续移动右指针
        // 否则改变left指针后面的数
        // 让left指针走一步
        // right指针继续往前走
        while(right<nums.length){
            if(nums[right] == nums[left]){
                right++;
            }else{
                nums[left+1] = nums[right];
                left++;
                right++;
            }
        }
        // 最后返回left指针加一即为新数组的长度
        return left+1;
    }
* */