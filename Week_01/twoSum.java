class Solution {
    public int[] twoSum(int[] nums, int target) {
        //从一个开始循环数组中每一个数（数组下标从0开始）
        for (int i = 0; i < nums.length - 1; i++) {
            //从i的下一个开始循环剩下的数（前面的已经在之前的循环中有了，不重复进行）
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("数组中没有两数之和等于目标值！");
    }
}