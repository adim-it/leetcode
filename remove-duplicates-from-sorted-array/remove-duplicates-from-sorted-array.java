class Solution {
    public int removeDuplicates(int[] nums) {
    	int len = nums.length;
    	int cnt = 0;

    	int tmp = Integer.MIN_VALUE;
    	for(int i = 0 ; i < len; i++) {
    		int num = nums[i];
    		if(tmp != num) {
    			nums[cnt] = num;
    			tmp = num;
    			cnt++;
    		} 
    	}
    	
    	return cnt;
    }
}