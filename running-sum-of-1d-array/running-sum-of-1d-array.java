class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum = 0;
        int len = nums.length;
        for(int i = 0 ; i < len ; i++) {
            int num = nums[i];
            nums[i] = num + sum;
            sum += num;
        }
        
        return nums;
    }
}