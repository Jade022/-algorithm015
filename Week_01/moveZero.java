/**
* 1.һ��ѭ��
*/
class Solution1 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(i != j){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
/**
* 2.��������ѭ��
*/
class Solution2 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
           }
       }
       for(int k = j;k < nums.length; k++){
            nums[k] = 0;
       }
    }
}