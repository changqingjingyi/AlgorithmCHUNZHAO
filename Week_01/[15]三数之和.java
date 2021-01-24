//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics 数组 双指针 
// 👍 2903 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//        if (nums == null || nums.length <= 2){
//            return Collections.emptyList();
//        }
//        Set<List<Integer>> result = new LinkedHashSet<>();
//        Arrays.sort(nums);
//        for (int i = 0;i<nums.length-2;i++){
//            if (nums[i] > 0){
//                return result;
//            }
//            if (i>0 && nums[i] == nums[i-1]){
//                continue;
//            }
//            int head = i+1;
//            int tail = nums.length-2;
//            while (head<tail){
//                if (-nums[i] == (nums[head]+nums[tail])){
//                    if (sum == nums[i]) {
//                        result.add(Arrays.asList(nums[i], nums[head], nums[tail]));
//                        // 加速3：跳过计算过的数据，同时防止结果重复
//                        while (head < tail && nums[head] == nums[head+1]) {
//                            head++;
//                        }
//                        while (head < tail && nums[tail] == nums[tail-1]) {
//                            tail--;
//                        }
//                    }
//                    if (sum <= nums[i]) {
//                        tail--;
//                    } else {
//                        head++;
//                    }
//                }
//            }
//
//            return result;
//            }

        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }
        Set<List<Integer>> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int target = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (map.get(target  - nums[j]) == null) {
                    map.put(nums[j], nums[j]);
                } else {
                    List<Integer> list = Arrays.asList(nums[i], map.get(target - nums[j]), nums[j]);
                    list.sort(Comparator.naturalOrder());
                    set.add(list);
                }
//                int v = target - nums[j];
//                Integer exist = hashMap.get(v);
//                if (exist != null) {
//                    List<Integer> list = Arrays.asList(nums[i], exist, nums[j]);
//                    list.sort(Comparator.naturalOrder());
//                    result.add(list);
//                } else {
//                    hashMap.put(nums[j], nums[j]);
//                }
            }
        }
        return new ArrayList<>(set);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
