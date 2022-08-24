package 两数之和;

import java.util.Arrays;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-23 10:25
 */
public class TwoNums {
    public int[] twoSum(int[] nums, int target) {
        // 构建空数组存储下标结果
        int[] result = new int[2];
        // 双重循环
        /* 漏洞：数组有重复
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // 需要结束，防止换位重复
                }
            }
        }*/
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // 需要结束，防止换位重复
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int[] a = new TwoNums().twoSum(nums, 10);
        System.out.println(Arrays.toString(a));
    }
}
