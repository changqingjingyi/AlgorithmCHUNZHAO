学习笔记
使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方：
代码如下：
class Solution {
    //半有序为升序
    public int ascending(int[] nums, int target) {
        if (nums == null || nums.length < 2){
            return -1;
        }
        int start = 0;
        int end = nums.length -1 ;
        int mid;
        while ( start < end){   
            mid = start + (end - start)/2;
            if(nums[start]>nums[mid] && mid - start ==1){//降序时：if(nums[start]<nums[mid])
                return mid;
            }
            if (nums[start] < nums[mid]){//降序时：if (nums[start] > nums[mid])
                start = mid;
            }else{
                end = mid;
            }     
        } 
    }
}