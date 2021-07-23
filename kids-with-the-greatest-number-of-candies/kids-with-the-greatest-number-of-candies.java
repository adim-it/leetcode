class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        List<Boolean> rslt = new ArrayList<Boolean>();
        
        int max = 0;
        for(int i = 0 ; i < len ; i++) {
            if(max < candies[i]) {
                max = candies[i];
            } 
        }
        
        for(int i = 0 ; i < len ; i++) {
            if(max <= candies[i] + extraCandies) {
                rslt.add(true);
            }  else {
                rslt.add(false);
            }
        }
        
        return rslt;
    }
}