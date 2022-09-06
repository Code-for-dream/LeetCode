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
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {

            if (target == nums[i]) {
                // 如果相等，返回下标
                return i;
            } else if (target > nums[i]) {
                // 顺序如果大于
                curr = i + 1;
            } else {
                // 顺序如果小于
                return curr;
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int result = new SearchInsertPosition().searchInsert(arr,7);
        System.out.println(result);
    }
}
