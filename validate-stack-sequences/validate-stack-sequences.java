class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
    	Stack<Integer> stack = new Stack<Integer>();
    	int popInd = 0;
    	int length = pushed.length;
    	
    	for(int n : pushed) {
    		stack.push(n);
    	
    		while(popInd < length && !stack.isEmpty() && stack.peek() == popped[popInd]) {
        			stack.pop();
        			popInd++;
    		}
    	}
    	
        return stack.empty();
    }
}