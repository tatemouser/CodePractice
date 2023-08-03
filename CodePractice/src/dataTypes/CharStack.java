package dataTypes;

import java.util.Stack;

public class CharStack {
	public boolean test(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char p = s.charAt(i);
			
			if(p == '(' || p == '{' || p == '{') {
				stack.push(p);
			} else {
				if(stack.isEmpty()) {
					return false;
				} else {
					char top = stack.pop();
                    if ((p == ')' && top != '(') || (p == '}' && top != '{') || (p == ']' && top != '[')) { 
                    	return false;
                    }
				}
			}
		}
		
		return stack.isEmpty();
	}
}
