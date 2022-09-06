package 搜索插入位置;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-09-06 20:36
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * <p>
 * 示例 1:
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 示例 2:
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 示例 3:
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SearchInsertPosition_simple {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // 用数组里的数和目标值比较
            if (nums[i] >= target) {
                // 数组里的数大于或等于目标值就返回当前的下标
                return i;
            }
        }
        // 如果数组里的数小于目标值，说明目标值最大，下标就是当前数组元素的长度
        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int result = new SearchInsertPosition_simple().searchInsert(arr, 7);
        System.out.println(result);
    }
}
