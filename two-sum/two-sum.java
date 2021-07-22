class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] rsltArr = null;
        for(int i = 0; i < nums.length -1 ; i++) {  
            int num = nums[i];
            for(int j = (i + 1); j < nums.length; j++) {
               
                if((num + nums[j]) == target) {
                    return new int[]  {i,j};
                    
                } 
            }
        }
        
        return rsltArr;
    }
    
}