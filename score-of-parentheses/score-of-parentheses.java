class Solution {
    public int scoreOfParentheses(String s) {
     return calParentheses(s);
    }
    
    private int calParentheses(String s) {
    int sum = 0;

    int len = s.length();
    int braketCnt = 0;
    int start = 0;
    for(int i = 0 ; i < len ; i++) {
        char c = s.charAt(i);
        if('(' == c) {
            braketCnt++;
        } else {
            braketCnt--;
        }

        if(braketCnt == 0) {
            if((i - start + 1) < 3) {
                sum += 1;
            } else {
                sum += calParentheses(s.substring(start + 1, i)) * 2;
            }

            start = i + 1;

        }
    }


    return sum;
}
}