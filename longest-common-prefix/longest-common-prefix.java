class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int len  = strs.length;
        int slen = s.length();
        
        String prefix = "";
        for(int i = 0 ; i < slen; i++ ) {
            prefix += s.charAt(i);
            for(int j = 0 ; j < len; j++) {
            	if(strs[j].indexOf(prefix) != 0) {
            		return prefix.substring(0, prefix.length() -1);
            	}
            }
        }
        
        return prefix;
    }
}