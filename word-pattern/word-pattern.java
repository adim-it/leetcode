class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<Character, String>();
        String[] sArr = s.split("\\s");
        int lenth = sArr.length;
        
        if(lenth != pattern.length()) {
            return false;
        }
        for(int i = 0 ; i < lenth; i++) {
            char c = pattern.charAt(i);
            if(map.containsKey(c)) {
                if(!map.get(c).equals(sArr[i])) {
                    return false;
                } 
            } else {
                if(!map.containsValue(sArr[i])) {
                    map.put(c, sArr[i]);
                } else {
                    return false;
                }
            }
        }
    
        
        return true;
        

    }
}