package 两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 骑着蜗牛ひ追导弹'
 * @date 2022-08-23 10:25
 */
public class TwoNums_up {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        // 判空
        if(nums == null || nums.length == 0){
            return res;
        }
        // 定义Map集合
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            // temp存储差数
            int temp = target - nums[i]; // 10-2=8 0
                                         // 10-5=5 1
                                         // 10-5=5 2
            if(map.containsKey(temp)){
                res[1] = i;              // 2
                res[0] = map.get(temp);  // 1
            }
            map.put(nums[i], i); // 2 0
                                 // 5 1
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int[] a = new TwoNums_up().twoSum(nums, 10);
        System.out.println(Arrays.toString(a));
    }
}
