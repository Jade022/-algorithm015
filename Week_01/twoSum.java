class Solution {
    public int[] twoSum(int[] nums, int target) {
        //��һ����ʼѭ��������ÿһ�����������±��0��ʼ��
        for (int i = 0; i < nums.length - 1; i++) {
            //��i����һ����ʼѭ��ʣ�µ�����ǰ����Ѿ���֮ǰ��ѭ�������ˣ����ظ����У�
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("������û������֮�͵���Ŀ��ֵ��");
    }
}