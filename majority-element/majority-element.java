class Solution {
    public int majorityElement(int[] nums) {
     	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums) {
        	if(map.containsKey(num)) {
        		map.put(num, map.get(num) + 1);
        	} else {
        		map.put(num, 1);
        	}
        }
        
        int max = 0;
        int major = 0;
        for(int key : map.keySet()) {
        	int val = map.get(key);
        	if (max < val) {
        		max = val;
        		major = key;
        	}
        }

        return major;
    }
}